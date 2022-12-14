package zork;

import java.util.*;

// TO GENERATE ROOM OBJECT INSTANCES
public class Room {
    
    // 
    private String roomCode;
    private String roomName;
    private String description;
    private Map<String, String> directions = new HashMap<String, String>();
    
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

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // getting location code of next location
    public String getLocation(String direction) {
        String code = directions.get(direction);
        return code;
    }

    // adding directions and location codes
    public void setDirections(String direction, String code) {
        this.directions.put(direction, code);
    }

    // allows you to view the contents of Object when printing
    @Override
    public String toString() {
        return "Room [roomCode=" + roomCode + ", roomName=" + roomName + ", description=" + description
                + ", directions=" + directions + "]";
    }
}
