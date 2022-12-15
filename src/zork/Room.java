package zork;

import java.util.*;

// TO GENERATE ROOM OBJECT INSTANCES
public class Room {
    
    // private variables for class
    private String roomCode;
    private String roomName;
    private String description;
    private Map<String, String> directions = new HashMap<String, String>();
    
    // public Room(String code) {
    //     this.roomCode = code;
    // }

    public String getRoomCode() {
        return roomCode;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getDescription() {
        return description;
    }

    // getting location code of next location
    public String getCode(String direction) {
        String code = directions.get(direction);
        return code;
    }

    public Map<String, String> getDirections() {
        
        return directions;
    }

    public void setRoomCode(String code) {
        this.roomCode = code;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public void setDescription(String description) {
        this.description = description;
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

    // allows to return empty value if user inputs invalid direction
    public Optional<String> go(String direction) {
		if (directions.containsKey(direction)) {
			return Optional.of(directions.get(direction));
        }
		return Optional.empty();
	}


}
