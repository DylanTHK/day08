package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import test.Room;

// FOR TESTING SNIPPETS OF CODE
public class Test {

    public static void main(String[] args) {
        List<Room> zorkRooms = new ArrayList<Room>();
        
        try {
            FileReader zorkFile = new FileReader("zork.txt"); // loads file
            BufferedReader myReader = new BufferedReader(zorkFile); // reads file
            
            Room tempRoom = new Room("west_of_house"); // new instance of Room
            tempRoom.setRoomName("West of House");
            
            
        

        } catch (IOException e) {
            e.getMessage();

        } // try catch
    } // main
} // class
