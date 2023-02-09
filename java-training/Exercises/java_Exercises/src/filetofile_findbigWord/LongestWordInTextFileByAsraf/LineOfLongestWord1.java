package filetofile_findbigWord.LongestWordInTextFileByAsraf;

import java.io.*;
import java.util.*;

public class LineOfLongestWord1 {
    public static void main(String[] args) {
        try {
            File myObj = new File("sample.txt");
            Scanner myReader = new Scanner(myObj);
            int largestWordLength = Integer.MIN_VALUE;
            List<Line> lines = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String lineData = myReader.nextLine();
                lines.add(new Line(lineData));
            }
            Line lineObjectWithMaxWord = null;
            for (Line line : lines) {
                int currentlargestWordLength = line.longestWordLength();
                if (currentlargestWordLength > largestWordLength) {
                    largestWordLength = currentlargestWordLength;
                    lineObjectWithMaxWord = line;
                }
            }
            System.out.println(lineObjectWithMaxWord.getFirst() + lineObjectWithMaxWord.getLastChar());
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    static class Line {
        String lineData;

        Line(String data) {
            this.lineData = data;
        }

        String getFirst() {
            return "" + lineData.charAt(0);
        }

        String getLastChar() {
            return "" + lineData.charAt(lineData.length() - 1);
        }

        int longestWordLength() {
            List<String> words = Arrays.asList(lineData.split(" "));
            int largestWordLength = Integer.MIN_VALUE;
            for (String x : words) {
                largestWordLength = Math.max(x.length(), largestWordLength);
            }
            return largestWordLength;
        }

    }


}
