package filetofile_findLongestWord;

import java.io.*;
import java.util.Scanner;

public class LongestWordinTextFile {
    public static void main(String [ ] args) throws IOException {
        System.out.println(LongestWordinTextFile.findLongestWord());
        System.out.println(LongestWordinTextFile.findLongestWordsInLine());

        BufferedWriter writer = new BufferedWriter(new FileWriter("stats1.txt"));
        writer.write(LongestWordinTextFile.findLongestWord());
        writer.write("\n" + LongestWordinTextFile.findLongestWordsInLine());
        writer.flush();
        writer.close();
    }

    public static String findLongestWord() throws FileNotFoundException {

        String longest_word_in_the_file = "";
        String current;
        Scanner sc = new Scanner(new File("sample1.txt"));

        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word_in_the_file.length()) {
                longest_word_in_the_file = current;
            }
        }
//        System.out.println("\n"+longest_word+"\n");
        return longest_word_in_the_file;
    }
    public static String findLongestWordsInLine() throws FileNotFoundException {
        int countLine = 0;
        String output = "";
        String filePath = "sample1.txt";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            try {
                while ((line = br.readLine()) != null) {
                    countLine++;
                    String[] words = line.split(" ");
                    for (String word : words) {
                        int n = line.length();
                        char first_character = line.charAt(0);
                        char last_character = line.charAt(n - 1);
                        if (word.equals(findLongestWord())) {
                            output = ("LongestWord line = " + countLine + "\n" + "First character of LongestWord line = " + first_character + "\n" + "Last character of LongestWord line = " + last_character);
                        }
                    }
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {

        }
        return output;

    }
}
