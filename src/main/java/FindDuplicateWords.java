import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWords {

    public static void main(String[] args) {
        String str = "abc abc ijk mno mno";
        String[] strArray = str.split(" "); //--> TC O(n) SC O(n)

        //TC =  O(n) and SC =
        Map<String, Integer> strMap = new HashMap<>(); // SC O(d) d is distinct value but worst case O(n)

        for (int i = 0; i < strArray.length; i++) { //--> TC O(n)
            if (strMap.containsKey(strArray[i])) {
                int c = strMap.get(strArray[i]);
                strMap.put(strArray[i], c + 1); // --> TC O(1)
                if (strMap.get(strArray[i]) > 1) {
                    System.out.println(strArray[i]);
                }
            } else {
                strMap.put(strArray[i], 1); // --> TC O(1)
            }
        }

        // Stream api
        Map<String, Long> steamMap =
                Arrays.stream(strArray)
                        .collect(Collectors
                                .groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(
                steamMap.entrySet()
                        .stream()
                        .filter(c -> c.getValue() > 1)
                        .collect(Collectors.toList()));

    }
}
