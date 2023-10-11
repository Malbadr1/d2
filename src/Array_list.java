import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_list {
    public static void getElement() {
        HashMap <Integer ,String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter element ");
        int key = 1;
        String input = "";
        while (!(input = scanner.next()).equals("done")) {
            map.put(key,input);
            key++;
        }

        System.out.println(map);
        for (Map.Entry i: map.entrySet()
             ) {
            System.out.print(i.getKey() + ":" +i.getValue() + ",");
        }
    }


    public static void main(String[] args) {
        getElement();

    }
}
