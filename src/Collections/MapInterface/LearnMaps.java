package Collections.MapInterface;

import java.util.HashMap;

public class LearnMaps {
    public static void main(String[] args) {
        HashMap<String, String> mp = new HashMap<>();
        mp.put("in", "India");
        mp.put("us", "United States of America");
        mp.put("br", "Brazil");
        System.out.println(mp);
        mp.remove("br");
        System.out.println(mp);
        System.out.println(mp.containsKey("in"));
        System.out.println(mp.containsValue("India"));
        System.out.println(mp.entrySet());
    }
}

/*
* Output:
    {br=Brazil, in=India, us=United States of America}
    {in=India, us=United States of America}
    true
    true
    [in=India, us=United States of America]
 */
