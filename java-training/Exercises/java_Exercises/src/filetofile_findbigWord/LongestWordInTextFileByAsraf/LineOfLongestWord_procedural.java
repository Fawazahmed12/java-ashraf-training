package filetofile_findbigWord.LongestWordInTextFileByAsraf;

import java.io.*;
import java.util.*;

public class LineOfLongestWord_procedural {
    public static void main(String[] args) {
        try {
            File myObj = new File("sample.txt");
            Scanner myReader = new Scanner(myObj);
            int largestWordLength = Integer.MIN_VALUE;
            int lineNumber = 0;
            int currentMaxLine = 0;
            List<String> lines = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String lineData = myReader.nextLine();
                lines.add(lineData);
                int lengthLargestWordOfCurrentLine = findLengthLargestWord(lineData);
                if (lengthLargestWordOfCurrentLine > largestWordLength) {
                    largestWordLength = lengthLargestWordOfCurrentLine;
                    currentMaxLine = lineNumber;
                }
                lineNumber++;
            }

            String lineWithLargestWord =  lines.get(currentMaxLine);
            System.out.println(lineWithLargestWord.charAt(0)+lineWithLargestWord.charAt(lineWithLargestWord.length()-1));

            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static int findLengthLargestWord(String line) {
        List<String> words = Arrays.asList(line.split(" "));
        int largestWordLength = Integer.MIN_VALUE;
        for (String x : words) {
            largestWordLength = Math.max(x.length(), largestWordLength);
        }
        return largestWordLength;

    }


}
