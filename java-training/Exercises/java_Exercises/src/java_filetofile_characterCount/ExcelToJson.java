package java_filetofile_characterCount;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ExcelToJson {
    public static void main(String[] args) {
        try {
            File myObj = new File("WarmingStations_Incomm_Ex (1).json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);
                ExcelToJson.generateKey(data);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void generateKey(String inputString) {

        List<Object> list = new ArrayList<>();

        for (int i=0; i<inputString.length();i++) {
            list.add(inputString);
            String sa[] = {inputString};
        }
//        System.out.println(list);
        String sa[] = {inputString};
        System.out.println("Initial Array:\n"
                + Arrays.toString(sa));

        HashMap<String, String> charCountMap
                = new HashMap<>();

        char[] strArray = inputString.toCharArray();

//        for (char c : strArray) {
//            if (charCountMap.containsKey(c)) {
//                charCountMap.put(c, charCountMap.get(c) + 1);
//            }
//            else {
//                charCountMap.put(c, 1);
//            }
//        }

        for (Map.Entry entry : charCountMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
