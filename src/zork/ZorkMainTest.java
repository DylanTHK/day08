package zork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZorkMainTest {
    
    public static void main(String[] args) {
        List<Room> zorkRooms = new ArrayList<Room>();
        
        try {
            FileReader zorkFile = new FileReader("zork.txt"); // loads file
            BufferedReader myReader = new BufferedReader(zorkFile); // reads file
            
            Room tempRoom = new Room(); // new instance of Room

            List<String> lines = myReader.lines()
                .toList();

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.getMessage();

        } // try catch
    } // main
} // class
