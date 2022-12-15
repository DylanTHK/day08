package zork;

import java.util.*;

public class GameMemory {
    
    // stores current Room's code
    private String currentRoom; // current location
    // links code to room instance <code, Room Instance>
    private Map<String, Room> roomMap = new HashMap<>();

    // getting current room
    public String getCurrentRoom() {
        return currentRoom;
    }

    // setting current room
    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }

    // adding code(key) and room instance (value)
    public void addRoom(String code, Room room) {
        this.roomMap.put(code, room);
    }
    
    // get room instance, replaces with empty if unable to find key
    public Optional<Room> getRoom(String code) {
		if (roomMap.containsKey(code))
			return Optional.of(roomMap.get(code));
		return Optional.empty();
	}

    @Override
    public String toString() {
        return "GameMemory [currentRoom=" + currentRoom + ", roomMap=" + roomMap + "]";
    }

}
