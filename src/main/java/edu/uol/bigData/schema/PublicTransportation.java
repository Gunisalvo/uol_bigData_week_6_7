package edu.uol.bigData.schema;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.springframework.stereotype.Component;

@Component
@CsvRecord(separator = ",",skipFirstLine = true)
public class PublicTransportation {

    @DataField(pos = 1)
    private String borough;

    @DataField(pos = 2)
    private Double bus;

    @DataField(pos = 3)
    private Double coach;

    @DataField(pos = 4)
    private Double total;

    @DataField(pos = 5)
    private Integer year;

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public Double getBus() {
        return bus;
    }

    public void setBus(Double bus) {
        this.bus = bus;
    }

    public Double getCoach() {
        return coach;
    }

    public void setCoach(Double coach) {
        this.coach = coach;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
