package zork;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("zork.txt");
        GameMemory memory = reader.addMemory();
        
        // System.out.println(memory);

        // initiate controller instance with game memory file (currentlocation & rooms HashMap)
        Controller game = new Controller(memory);

        // calls start method in Controller object
        game.start();
        
    }
}
