import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }

    public static int convert(char symbol){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        return map.get(symbol);
    }
}