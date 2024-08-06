import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        ArrayList<HashMap<String,Integer>> arrayList

        HashMap<String,Integer> myfriends = new HashMap<>();
        //adding the name with age
        myfriends.put("John", 1);
        myfriends.put("Jane", 4);
        myfriends.put("Jack", 3);
        System.out.println(myfriends);

        for (String name : myfriends.keySet()) {
            System.out.println(name);

        }
        for (int age : myfriends.values()) {
            System.out.println(age);
        }

        //to access the specific value from hashmap
        System.out.println(myfriends.get("Jack"));
    }
}
