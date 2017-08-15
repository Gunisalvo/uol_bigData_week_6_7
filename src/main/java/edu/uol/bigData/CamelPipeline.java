package edu.uol.bigData;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class CamelPipeline {

    private MongoClient client;

    @Autowired
    public CamelPipeline(@Value("${mongodb.host}") String mongodbHost, @Value("${mongodb.port}") Integer mongodbPort){
        this.client = new MongoClient(mongodbHost, mongodbPort);
    }

    public static void main(String[] args) throws Exception{
        SpringApplication application = new SpringApplication(CamelPipeline.class);
        application.addListeners(new ApplicationPidFileWriter("./bin/camel_app.pid"));
        application.run(args);

        while(true){
            //block main thread
        }

    }

    @Bean("mongoClient")
    public MongoClient getMongoClient(){
        return this.client;
    }


}
