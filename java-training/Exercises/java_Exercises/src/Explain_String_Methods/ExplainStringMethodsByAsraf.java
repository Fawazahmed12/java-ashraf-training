package Explain_String_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExplainStringMethodsByAsraf {


    public static void main(String[] args) {

        String str = "America";
        String inbetween = str.substring(2, 5);
        String delintedText = "Hello-World";
        String splitedValues[] = delintedText.split("-");

        boolean startResult = str.startsWith("Am");
        boolean falseResult = str.startsWith("Xy");

        boolean trueEnds = str.endsWith("ca");
        boolean falseEnda = str.endsWith("44566");

        String myString = "123456";
        String newString = myString + "AAAA";


        List<String> splitValues = simpleSplit("State-Bank-Of-India", "-");
        print(splitValues);

      int position = delintedText.indexOf("-");
        int fromLastIndex = delintedText.lastIndexOf("-");


        validateEmailAddress("superman@gmail.com"); // true allowed email domain com,net,io
        validateEmailAddress("1234ABCD@gmail.com"); // false
        validateEmailAddress("1234ABCDcom"); // false
        validateEmailAddress("gmail.com"); // false


    }

    public static List<String> simpleSplit(String sourceStr, String characterUsedForSplit) {
        // Fix the implementation
        List<String> strList = new ArrayList<>();
        int fromIndex = 0;
        for (int i = 0; i < sourceStr.length(); i++) {
            Character value = sourceStr.charAt(i);
            if (value.toString().equals(characterUsedForSplit)) {
                String splitPortion = sourceStr.substring(fromIndex, i);
                strList.add(splitPortion);
                fromIndex = i;
            }
        }
        return strList;
    }

    public static boolean validateEmailAddress(String emailAddress) {
        List<String> validExtensions = Arrays.asList("com", "io","net");
        if (emailAddress.contains("@") && emailAddress.contains(".")) {
            int indexWhereAtIsThere = emailAddress.indexOf("@");
            int dotPosition = emailAddress.indexOf(" .");
            String namePart = emailAddress. substring(0, indexWhereAtIsThere);
            boolean validName = true;
            for (Character ch : namePart.toCharArray()) {
                if (ch >= '0' && ch <= '9') {
                    validName = false;
                    break;
                }
            }
// domain PartCheck
                String domainPart = emailAddress.substring (dotPosition);
                boolean validDomain = validExtensions.contains (domainPart);
                return validName && validDomain;
            }
        return false;
    }



    private static void print(Object value) {
        System.out.print(value); // print and println
    }
}
