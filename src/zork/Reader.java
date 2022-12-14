package zork;

import java.io.*;
import java.util.*;
import static zork.KeyWords.*;

// TO PARSE AND CALL ROOM CLASS TO INSTANTIATE INFO FROM zork.txt
public class Reader {
    
    private String fileName;

    // Constructor for file name (zork.txt)
    Reader(String fileName) {
        this.fileName = fileName;
    }

    // reads text file and returns GameMemory Object with currentRoom, roomMap (code, room)
    public GameMemory addMemory() {
        // Instantiate GameMemory
        GameMemory memory = new GameMemory();
        try {
            FileReader fr = new FileReader(fileName); // loads file
            BufferedReader br = new BufferedReader(fr); // reads file
                         
            // List<String> lines = br.lines().toList(); // converts entire file -> stream -> list
            String line;
            Room tempRoom = new Room();

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.length() <= 0) { // catches blank lines
                    continue; // skips this iteration, go to next line
                }

                String[] lineArray = line.split(": ");
                String command = lineArray[0];
                String value = lineArray[1];

                switch (command) {
                    case ROOM:
                        tempRoom = new Room();
                        memory.addRoom(value, tempRoom);    
                        tempRoom.setRoomCode(value); 
                        break;
                    case NAME:
                        tempRoom.setRoomName(value);
                        // System.out.println(tempRoom); 
                        break;
                    case DESC:
                        String newValue = value.replaceAll("<break>", "\n");
                        tempRoom.setDescription(newValue);
                        break;
                    case DIRECTION:
                        // room HashMap<direction, code>
                        String[] valueArray = value.split(" ");
                        tempRoom.setDirections(valueArray[0], valueArray[1]);
                        break;
                    case START:
                        memory.setCurrentRoom(value);
                        break;
                    default:
                } // switch
            } // while loop
            br.close();

        } catch (IOException e) {
            e.getMessage();
        }

        return memory;
    } // addMemory method


}
