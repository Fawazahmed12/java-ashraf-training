package Explain_String_Methods;

import java.util.ArrayList;
import java.util.List;

public class ExplainStringMethodsByFawaz {

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

        validateEmailAddress("superman@gmail.com"); // true    allowed email domain com,net,io
        validateEmailAddress("1234ABCD@gmail.com"); // false
        validateEmailAddress("1234ABCDcom"); // false
        validateEmailAddress("gmail.com"); // false

        validateEmailAddress("superman@domain.com");//true
        validateEmailAddress("superman@gmail.net");// true
        validateEmailAddress("superman@gmail.io");//true
        validateEmailAddress("superman@domain.co.in");//true

    }

    public static List<String> simpleSplit(String sourceStr, String characterUsedForSplit) {
        // Fix the implementation
        List<String> strList = new ArrayList<>();
        int fromIndex = 0;
        for (int i = 0; i < sourceStr.length(); i++) {
            Character value = sourceStr.charAt(i);
            if (value.toString().equals(characterUsedForSplit)) {
                String splitPortion = sourceStr.substring(fromIndex, i);
                System.out.println(splitPortion);
                strList.add(splitPortion);
                fromIndex = i + 1;
            }
        }
        return strList;
    }

    public static boolean validateEmailAddress(String emailAddress) {
        List<String> strList = new ArrayList<>();
        String answer;
        String[] strEndsWith = {"domain.co.in","domain.com","gmail.com","gmail.net","gmail.io"};
        String[] arrOfStr = emailAddress.split("@", 5);
        if (emailAddress.substring(0, arrOfStr[0].length()).startsWith("s") && emailAddress.endsWith(strEndsWith[1])) {
            answer = String.valueOf(strList.add(emailAddress));
        }
        else if (emailAddress.substring(0, arrOfStr[0].length()).startsWith("s") && emailAddress.endsWith(strEndsWith[2])) {
            answer = String.valueOf(strList.add(emailAddress));
        }
        else if (emailAddress.substring(0, arrOfStr[0].length()).startsWith("s") && emailAddress.endsWith(strEndsWith[3])) {
            answer = String.valueOf(strList.add(emailAddress));
        }
        else if (emailAddress.substring(0, arrOfStr[0].length()).startsWith("s") && emailAddress.endsWith(strEndsWith[4])) {
            answer = String.valueOf(strList.add(emailAddress));
        }
        else if (emailAddress.substring(0, arrOfStr[0].length()).startsWith("s") && emailAddress.endsWith(strEndsWith[0])) {
            answer = String.valueOf(strList.add(emailAddress));
        }
        else{
            answer = "false";
        }
        System.out.println(answer);

        return false;
    }

        //another way
//    public static boolean validateEmailAddress(String emailAddress) {
////        Boolean result = emailAddress.matches("[a-zA-Z]+");
//        String character = "^([a-zA-Z]+)@(.+)$";
//        boolean result = emailAddress.matches(character);
//        List<String> strList = new ArrayList<>();
//        String answer;
//        if (result) {
//            answer = String.valueOf(strList.add(emailAddress));
//        }
//        else {
//            answer = "false";
//        }
//        System.out.println(answer);
//        return false;
//    }

    private static void print(Object value) {
        System.out.print(value); // print and println
    }
}
