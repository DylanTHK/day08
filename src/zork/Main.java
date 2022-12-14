package zork;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("zork.txt");
        GameMemory memory = reader.addMemory();
        
        System.out.println(memory);
    }
}
