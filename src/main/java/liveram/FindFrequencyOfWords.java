package liveram;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfWords {

    public static void main(String[] args) {

//        Time Complexity O(n+m)
//        Space Complexity O(n)
        String str = "abc abc efg ijk";

        String[] strArray = str.split(" ");  // --- O(m) TC  // -- O(n) SC

        Map<String, Integer> strMap = new HashMap<>();  // O(unique words) SC

        for (int i = 0; i < strArray.length; i++) { //-- O(n)
            if (strMap.containsKey(strArray[i])) {
                int c = strMap.get(strArray[i]);
                strMap.put(strArray[i], c + 1);
            } else {
                strMap.put(strArray[i], 1);
            }
        }
        for(Map.Entry<String,Integer> map:strMap.entrySet()){
            System.out.print(map.getKey() +" ------- "+map.getValue()+"\n");
        }

//        Stream APIs



    }
}
