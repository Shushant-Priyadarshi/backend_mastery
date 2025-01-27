package advance;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String ,Integer> marks = new HashMap<>();
        marks.put("Rajneet",90);
        marks.put("Shushant",80);
        System.out.println(marks);
        System.out.println(marks.get("Rajneet"));

        for(Map.Entry<String ,Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println("********************************************");
        }
    }
}
