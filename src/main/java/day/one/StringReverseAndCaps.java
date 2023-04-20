package day.one;

public class StringReverseAndCaps {
    /*
        Reverse the string and then do the init caps
     */
    public static void main(String[] args) {
        String str = "hells world";
        StringBuilder strB = new StringBuilder();
        // Is to reverse the string and put it in string builder
        for (int i = str.length() - 1; i >= 0; i--) {
            strB.append(str.charAt(i));
        }

        //split the string from ""
        String[] strR = String.valueOf(strB).split(" ");
        for (int j = 0; j < strR.length; j++) {
            for (int k = 0; k < strR[j].length(); k++) {
                if (k == 0) {
                    System.out.println(j + "--" + k + "---" + strR[j].toUpperCase().charAt(k));
                } else {
                    System.out.println(j + "--" + k + "---" + strR[j].charAt(k));
                }
            }
        }

    }
}
