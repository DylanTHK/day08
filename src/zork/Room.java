package zork;

import java.util.ArrayList;
import java.util.List;

public class Room {
    
    private String roomCode;
    private String roomName;
    private String description;
    private List<String> availableDirections = new ArrayList<String>();
    private List<String> locations = new ArrayList<String>();


    public Room() {
    }


    public String getRoomCode() {
        return roomCode;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getAvailableDirections() {
        return availableDirections;
    }
    
    public List<String> getLocations() {
        return locations;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailableDirections(String availableDirections) {
        this.availableDirections.add(availableDirections);
    }

    public void setLocations(String locations) {
        this.locations.add(locations);
    }

    // allows you to view the contents of Object when printing
    @Override 
    public String toString() {
        return "Room [roomCode=" + roomCode + ", roomName=" + roomName + ", description=" + description
                + ", availableDirections=" + availableDirections + ", locations=" + locations + "]";
    }

}
