package java_filetofile_characterCount;

import java.io.*;
import java.util.*;

public class ReadTheTextFileByFawaz {
    public static void main(String[] args) {
        try {
            File myObj = new File("sample.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ReadTheTextFileByFawaz.characterCount(data);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void characterCount(String inputString) throws IOException {

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        List<String> ls = new ArrayList<>();

        String output = "";
        for (Map.Entry entry : charCountMap.entrySet()) {
            output = entry.getKey() + " " + entry.getValue();
            ls.add(output);
        }
        System.out.println(ls);
        BufferedWriter writer = new BufferedWriter(new FileWriter("stats.txt"));
        writer.write(ls.toString());
        writer.flush();
        writer.close();
    }

}
