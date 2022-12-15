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
            // get available directions from room instance key set
            Set<String> availableDirection = currRoom.getMap().keySet();
            if (userInput.equals(EXIT)) {
                // stop = true;
                break;
            } else if (availableDirection.contains(userInput)) {
                // getting new room instance with direction
                // (dir -> currRoom -> currRoom.getDirections() -> value = .getCode(dir)) gets value(code)
                String currentCode = currRoom.getCode(userInput);
                // use roomCode to update currRoom
                optionalRoom = gameMemory.getRoom(currentCode);
                if (optionalRoom.isPresent()) {
                    currRoom = optionalRoom.get();
                }
            } else {
                System.out.println("\n!=====WARNING=====!\nInvalid direction detected, please try again");
            }

            // // print Location
            printLocation(currRoom);

        } // while loop
        scanner.close();

    }

    // takes location code, to search for room hashmap
    public void printLocation(Room room) {
        System.out.printf("name: %s\n", room.getRoomName());

        System.out.printf("description: %s\n", room.getDescription());

        Map<String, String> currMap = room.getMap();
        for (Map.Entry<String, String> entry : currMap.entrySet()) {
            System.out.printf("direction: %s %s\n", entry.getKey(), entry.getValue());
        }
    }

} // class Controller
