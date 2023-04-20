package DayOne;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterInString {

    /*
      Count the number of character occurrence in string
     */

    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)){  //---> contains key
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.println(e.getKey() +" occurs in string for "+e.getValue());
        }
    }
}
