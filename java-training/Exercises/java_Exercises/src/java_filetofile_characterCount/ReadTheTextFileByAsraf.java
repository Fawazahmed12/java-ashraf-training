package java_filetofile_characterCount;

import java.io.*;
import java.util.*;

public class ReadTheTextFileByAsraf {
    public static void main(String[] args) {
        try {
            File myObj = new File("sample.txt");
            Scanner myReader = new Scanner(myObj);
            HashMap<Character, Integer> allCharCount = new HashMap<>();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ReadTheTextFileByAsraf.characterCount(data, allCharCount);
            }
            myReader.close();

            printLines(allCharCount);

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void printLines(HashMap<Character, Integer> charCountMap) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

        String output = "";
        for (Map.Entry entry : charCountMap.entrySet()) {
            output = entry.getKey() + " = " + entry.getValue() + "\n";
            stringBuilder.append(output);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("stats.txt"));
        writer.write(stringBuilder.toString());
        writer.flush();
        writer.close();
    }

    public static void characterCount(String inputString, HashMap<Character, Integer> charCountMap) throws IOException {

        char[] strArray = inputString.toCharArray();
        List<Character> exlcudedCharactes = Arrays.asList(' ', ',', ':','.');

        for (char c : strArray) {
            if (exlcudedCharactes.contains(c)) {
                continue;
            }
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }


    }

}
