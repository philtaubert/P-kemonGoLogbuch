package model;

import javax.json.Json;
import javax.json.JsonObject;
import java.sql.Time;

public class WayPoint {
    private int number;
    private int userId;
    private Time time;
    private String coordinates;
    private String locationName;

    public WayPoint(int number, int userId) {
        this.number = number;
        this.userId = userId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public JsonObject toJson(){
        return Json.createObjectBuilder()
                .add("number", number)
                .add("userId", userId)
                .add("time", time.getTime())
                .add("coordinates", coordinates)
                .add("locationName", locationName)
                .build();
    }
}
