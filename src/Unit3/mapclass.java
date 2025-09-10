package Unit3;

import java.util.HashMap;

public class mapclass {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("First",1);
        hm.put("Second",2);
        System.out.println(hm);
        System.out.println(hm.get("First"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
    }
}
