package edu.uol.bigData.schema;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.springframework.stereotype.Component;

@Component
@CsvRecord(separator = ",",skipFirstLine = true)
public class Road {

    @DataField(pos = 1)
    private String gridid;

    @DataField(pos = 2)
    private String toid;

    @DataField(pos = 3)
    private String grid_exactcut_id;

    @DataField(pos = 4)
    private String location_exactcut;

    @DataField(pos = 5)
    private String boroughname_exactcut;

    @DataField(pos = 6)
    private String indicator;

    @DataField(pos = 7)
    private String length;

    @DataField(pos = 8)
    private String emissionsUnt;

    @DataField(pos = 9)
    private String year;

    @DataField(pos = 10)
    private String pollutant;

    @DataField(pos = 11)
    private String emissions;

    @DataField(pos = 12)
    private String motorcycle;

    @DataField(pos = 13)
    private String taxi;

    @DataField(pos = 14)
    private String car;

    @DataField(pos = 15)
    private String busandcoach;

    @DataField(pos = 16)
    private String lgv;

    @DataField(pos = 17)
    private String rigid;

    @DataField(pos = 18)
    private String artic;

    @DataField(pos = 19)
    private String rigid2axle;

    @DataField(pos = 20)
    private String rigid3axle;

    @DataField(pos = 21)
    private String rigid4axle;

    @DataField(pos = 22)
    private String artic3axle;

    @DataField(pos = 23)
    private String artic5axle;

    @DataField(pos = 24)
    private String artic6axle;

    @DataField(pos = 25)
    private String petrolcar;

    @DataField(pos = 26)
    private String dieselcar;

    @DataField(pos = 27)
    private String petrollgv;

    @DataField(pos = 28)
    private String diesellgv;

    @DataField(pos = 29)
    private String ltbus;

    @DataField(pos = 30)
    private String coach;

    @DataField(pos = 31)
    private String electriccar;

    @DataField(pos = 32)
    private String electriclgv;

    public String getGridid() {
        return gridid;
    }

    public void setGridid(String gridid) {
        this.gridid = gridid;
    }

    public String getToid() {
        return toid;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }

    public String getGrid_exactcut_id() {
        return grid_exactcut_id;
    }

    public void setGrid_exactcut_id(String grid_exactcut_id) {
        this.grid_exactcut_id = grid_exactcut_id;
    }

    public String getLocation_exactcut() {
        return location_exactcut;
    }

    public void setLocation_exactcut(String location_exactcut) {
        this.location_exactcut = location_exactcut;
    }

    public String getBoroughname_exactcut() {
        return boroughname_exactcut;
    }

    public void setBoroughname_exactcut(String boroughname_exactcut) {
        this.boroughname_exactcut = boroughname_exactcut;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getEmissionsUnt() {
        return emissionsUnt;
    }

    public void setEmissionsUnt(String emissionsUnt) {
        this.emissionsUnt = emissionsUnt;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPollutant() {
        return pollutant;
    }

    public void setPollutant(String pollutant) {
        this.pollutant = pollutant;
    }

    public String getEmissions() {
        return emissions;
    }

    public void setEmissions(String emissions) {
        this.emissions = emissions;
    }

    public String getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(String motorcycle) {
        this.motorcycle = motorcycle;
    }

    public String getTaxi() {
        return taxi;
    }

    public void setTaxi(String taxi) {
        this.taxi = taxi;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getBusandcoach() {
        return busandcoach;
    }

    public void setBusandcoach(String busandcoach) {
        this.busandcoach = busandcoach;
    }

    public String getLgv() {
        return lgv;
    }

    public void setLgv(String lgv) {
        this.lgv = lgv;
    }

    public String getRigid() {
        return rigid;
    }

    public void setRigid(String rigid) {
        this.rigid = rigid;
    }

    public String getArtic() {
        return artic;
    }

    public void setArtic(String artic) {
        this.artic = artic;
    }

    public String getRigid2axle() {
        return rigid2axle;
    }

    public void setRigid2axle(String rigid2axle) {
        this.rigid2axle = rigid2axle;
    }

    public String getRigid3axle() {
        return rigid3axle;
    }

    public void setRigid3axle(String rigid3axle) {
        this.rigid3axle = rigid3axle;
    }

    public String getRigid4axle() {
        return rigid4axle;
    }

    public void setRigid4axle(String rigid4axle) {
        this.rigid4axle = rigid4axle;
    }

    public String getArtic3axle() {
        return artic3axle;
    }

    public void setArtic3axle(String artic3axle) {
        this.artic3axle = artic3axle;
    }

    public String getArtic5axle() {
        return artic5axle;
    }

    public void setArtic5axle(String artic5axle) {
        this.artic5axle = artic5axle;
    }

    public String getArtic6axle() {
        return artic6axle;
    }

    public void setArtic6axle(String artic6axle) {
        this.artic6axle = artic6axle;
    }

    public String getPetrolcar() {
        return petrolcar;
    }

    public void setPetrolcar(String petrolcar) {
        this.petrolcar = petrolcar;
    }

    public String getDieselcar() {
        return dieselcar;
    }

    public void setDieselcar(String dieselcar) {
        this.dieselcar = dieselcar;
    }

    public String getPetrollgv() {
        return petrollgv;
    }

    public void setPetrollgv(String petrollgv) {
        this.petrollgv = petrollgv;
    }

    public String getDiesellgv() {
        return diesellgv;
    }

    public void setDiesellgv(String diesellgv) {
        this.diesellgv = diesellgv;
    }

    public String getLtbus() {
        return ltbus;
    }

    public void setLtbus(String ltbus) {
        this.ltbus = ltbus;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getElectriccar() {
        return electriccar;
    }

    public void setElectriccar(String electriccar) {
        this.electriccar = electriccar;
    }

    public String getElectriclgv() {
        return electriclgv;
    }

    public void setElectriclgv(String electriclgv) {
        this.electriclgv = electriclgv;
    }
}
