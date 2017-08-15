package edu.uol.bigData.route;

import edu.uol.bigData.schema.PublicTransportation;
import edu.uol.bigData.schema.Road;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public final class ToDatabase extends RouteBuilder {

    private String mongoDbRoutePublicTransportation;

    private String mongoDbRoutePublicRoads;

    @Autowired
    public ToDatabase(@Value("${mongodb.database}") String database,
                      @Value("${mongodb.collection.publicTransportation}") String publicTransportationCollection,
                      @Value("${mongodb.collection.roads}") String roadsCollection){
        this.mongoDbRoutePublicTransportation = "mongodb:mongoClient?database=" +
                database + "&collection=" +
                publicTransportationCollection + "&operation=insert";

        this.mongoDbRoutePublicRoads = "mongodb:mongoClient?database=" +
                database + "&collection=" +
                roadsCollection + "&operation=insert";
    }

    @Override
    public void configure() throws Exception {

        from("file://inbox/public_transportation?delete=true&idempotent=true&readLock=changed&readLockCheckInterval=1500")
                .routeId("PublicTransportationToMongoDB")
                .unmarshal(new BindyCsvDataFormat(PublicTransportation.class))
                .to(this.mongoDbRoutePublicTransportation);

        from("file://inbox/roads?delete=true&idempotent=true&readLock=changed&readLockCheckInterval=1500")
                .routeId("RoadsToMongoDB")
                .unmarshal(new BindyCsvDataFormat(Road.class))
                .to(this.mongoDbRoutePublicRoads);
    }

}