package haui.tranducdao.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "building")
public class Building extends  BaseEntity {

    @Column(name = "buildingName")
    private String buildingName;

    @Column(name = "buildingCategoryId")
    private String buildingCategoryId;

    @Column(name = "buildingDescription")
    private String getBuildingDescription;

    @Column(name = "carpark")
    private int carpark;

    @Column(name = "motopark")
    private int motopark;

    @Column(name = "serviceCost")
    private int serviceCost;

    @Column(name = "electrictCost")
    private int electricCost;

    @Column(name = "waterCost")
    private int waterCost;

    @Column(name = "altarRoom")
    private int altarRoom;

    @Column(name = "bathRoom")
    private int bathRoom;

    @Column(name = "badRoom")
    private int badRoom;

    @Column(name = "toilet")
    private int toilet;

    @Column(name = "campusArea")
    private int campusArea;

    @Column(name = "floorArea")
    private int floorArea;

    @Column(name = "depoisit")
    private long depoisit;
    
    @Column(name = "price")
    private long price;
    
    @Column(name = "direction")
    private String direction;

    @Column(name = "status")
    private String status;

    @Column(name = "map")
    private String map;

    @Column(name = "wardId")
    private String wardId;

    @Column(name = "address")
    private String address;

    @Column(name = "houseOwner")
    private String houseOwner;


    public String getBuildingCategoryId() {
        return buildingCategoryId;
    }

    public void setBuildingCategoryId(String buildingCategoryId) {
        this.buildingCategoryId = buildingCategoryId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getGetBuildingDescription() {
        return getBuildingDescription;
    }

    public void setGetBuildingDescription(String getBuildingDescription) {
        this.getBuildingDescription = getBuildingDescription;
    }

    public int getCarpark() {
        return carpark;
    }

    public void setCarpark(int carpark) {
        this.carpark = carpark;
    }

    public int getMotopark() {
        return motopark;
    }

    public void setMotopark(int motopark) {
        this.motopark = motopark;
    }

    public int getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
    }

    public int getElectricCost() {
        return electricCost;
    }

    public void setElectricCost(int electricCost) {
        this.electricCost = electricCost;
    }

    public int getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(int waterCost) {
        this.waterCost = waterCost;
    }

    public int getAltarRoom() {
        return altarRoom;
    }

    public void setAltarRoom(int altarRoom) {
        this.altarRoom = altarRoom;
    }

    public int getBathRoom() {
        return bathRoom;
    }

    public void setBathRoom(int bathRoom) {
        this.bathRoom = bathRoom;
    }

    public int getBadRoom() {
        return badRoom;
    }

    public void setBadRoom(int badRoom) {
        this.badRoom = badRoom;
    }

    public int getToilet() {
        return toilet;
    }

    public void setToilet(int toilet) {
        this.toilet = toilet;
    }

    public int getCampusArea() {
        return campusArea;
    }

    public void setCampusArea(int campusArea) {
        this.campusArea = campusArea;
    }

    public int getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(int floorArea) {
        this.floorArea = floorArea;
    }

    public long getDepoisit() {
        return depoisit;
    }

    public void setDepoisit(long depoisit) {
        this.depoisit = depoisit;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(String houseOwner) {
        this.houseOwner = houseOwner;
    }
}
