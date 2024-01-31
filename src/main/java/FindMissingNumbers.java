import java.util.Arrays;
import java.util.HashSet;

public class FindMissingNumbers {

    public static void main(String[] args){
        int[] intArray = {5,7,9,8,1,2,3};
        Arrays.sort(intArray);

//       Arrays.stream(intArray).forEach(
//               value -> {System.out.println(value);}
//        );

        int min = Arrays.stream(intArray).min().getAsInt();
        int max = Arrays.stream(intArray).max().getAsInt();

        HashSet<Integer> hasSet = new HashSet<>();

        for(int num : intArray){
            hasSet.add(num);
        }
       // System.out.println(hasSet);

        for(int i = min ; i< max ; i++){
            if(!hasSet.contains(i)){
                System.out.println(i);
            }
        }
    }
}
