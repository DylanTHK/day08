package zork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static zork.KeyWords.*;

public class ZorkMain {
        

    public static void main(String[] args) {
        
        try {
            FileReader zorkFile = new FileReader("zork.txt"); // loads file
            BufferedReader myReader = new BufferedReader(zorkFile); // reads file
                         
            List<String> lines = myReader.lines().toList(); // converts entire file -> stream -> list

            List<Room> zorkRooms = generateRooms(lines); // passing list of lines to get back list of Rooms
            String[] start = lines.get(lines.size() - 1).split(": ");
            String currentLocation = start[1];

            myReader.close();
            System.out.println(zorkRooms);

            // Loop to take user input
            Boolean stop = false;
            while (!stop) {
                // take in input from user
                
            }
        } catch (IOException e) {
            e.getMessage();

        } // try catch
    } // main

    // converts list of lines to List of Room Object Instances
    private static List<Room> generateRooms(List<String> lines) {
        List<Room> allRooms = new ArrayList<Room>();
        Room tempRoom = new Room();
        for (String line: lines) { // repeat for each line list
            if (line.equals("")) { // detects white spaces
                allRooms.add(tempRoom);
                tempRoom = new Room();
                continue;
            } else {
                // temporary variables
                String[] dataArray = line.split(": ");
                String property = dataArray[0];
                String value = dataArray[1];
                // System.out.println("Current Property: " + property + ", Current Value: " + value);

                // detect property and assign object
                switch (property) {
                    case ROOM:
                        tempRoom.setRoomCode(value); 
                        // System.out.println(tempRoom); 
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
                        String[] valueArray = value.split(" ");
                        tempRoom.setAvailableDirections(valueArray[0]);
                        tempRoom.setLocations(valueArray[1]);
                        // System.out.println(tempRoom); 
                        break;
                    default:
                } // switch
            } // if else
        } // while loop   
        allRooms.add(tempRoom);
        // System.out.println(tempRoom);
        return  allRooms;
    } // generateRooms

} // class ZorkMain
