package zork;

import java.util.*;
import static zork.KeyWords.*;

public class Controller {
    
    private GameMemory gameMemory;
    
    public Controller(GameMemory memory) {
        this.gameMemory = memory;
    }

    // initiate game code from here
    public void start() {
        // print current location (code)
        String currCode = this.gameMemory.getCurrentRoom(); // gets current location code
        // unbox optional to get room instance
        Optional<Room> optionalRoom = gameMemory.getRoom(currCode);
        Room currRoom = new Room();
        if (optionalRoom.isPresent()) {
             currRoom = optionalRoom.get();
        }
        // formats and prints information for user
        printLocation(currRoom);

        // get user input (direction)
        Boolean stop = false;
        Scanner scanner = new Scanner(System.in);
        while(!stop) {
            String userInput = scanner.nextLine();
            if (userInput.equals(EXIT)) {
                // stop = true;
                break;
            };
        }
        scanner.close();

        
        // use direction (retrieve code from direction) if any

        // use location code to retrieve next location

        // 

    }

    // takes location code, to search for room hashmap
    public void printLocation(Room room) {
        System.out.printf("name: %s\n", room.getRoomName());

        System.out.printf("description: %s\n", room.getDescription());

        Map<String, String> currMap = room.getDirections();
        for (Map.Entry<String, String> entry : currMap.entrySet()) {
            System.out.printf("direction: %s %s\n", entry.getKey(), entry.getValue());
        }
    }

} // class Controller
