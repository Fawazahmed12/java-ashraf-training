package filetofile_findLongestWord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ReadTheTextFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("sample1.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ReadTheTextFile.calculateLongestWord(myReader,myObj);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



    public static void calculateLongestWord( Scanner scanner,File file) throws IOException {
        String longest_word_in_the_file = "";
        String current_word;
        int counter = 0;
        String line;
        FileReader fileReader = null;
        int count = 1;
        String word1 = "";

        //Longest Character
        while (scanner.hasNext()) {
            current_word = scanner.next();
            if (current_word.length() > longest_word_in_the_file.length()) {
                longest_word_in_the_file = current_word ;
//                System.out.println(longest_word_in_the_file + " Line " + "=" + count);
            }
//            count++;
        }
//        System.out.println(count);
        String longestWord = "\n"+longest_word_in_the_file+"\n";
        System.out.println("longestCharacter " + longestWord);



        //first&last Character
        String lines = Files.readAllLines(Path.of(file.toURI())).get(10);
        System.out.println(lines);
        int n = lines.length();
        char first_character = lines.charAt(0);
        char last_character = lines.charAt(n - 1);

        System.out.println("First_Letter: " + first_character);
        System.out.println("Last_Letter: " + last_character);


        //longestWord present line;
        try {
            fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line + " = " + counter);
                counter++;
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equals(longestWord)) {
                         word1 = ("LongestWord line = " + line + "\n" + "First character of line = " + line.charAt(0) + "\n" + "Last character of line = " + line.charAt(line.length() - 1));
                    }
                }
            }
            System.out.println(word1);
        } finally {

        }

    }

}

