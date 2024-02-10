import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if (sArr.length != tArr.length) {
            System.out.println("false");
        }

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                System.out.println("false");
            }
        }

    }
}
