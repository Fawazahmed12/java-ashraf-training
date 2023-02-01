package Try;

public class Learnsplit {
   static String source = "State-Bank-of-india";
  static   String splitString = "-";

    public static void main(String[] args) {
        String output =  source.replace(splitString,"");
        System.out.println(output);


//        for (int i=0;i<source.length(); i++) {
//         String value = String.valueOf(source.charAt(i));
//         if (value.equals(splitString) ) {
//            String output =  source.replace(splitString,"");
//             System.out.println(output);
//         }
//        }
    }
}
