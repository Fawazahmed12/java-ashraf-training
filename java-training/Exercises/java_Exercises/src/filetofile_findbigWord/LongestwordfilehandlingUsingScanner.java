package filetofile_findbigWord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LongestwordfilehandlingUsingScanner {
    public static void main(String arg[]) throws IOException{

        String line;
        int wordLength = 0;
        String splittedWord ;
        int count =1;
        String longestWordLine = null;
        try {
            File myObj = new File("sample1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                line = myReader.nextLine();
                String[] splittedWords = line.split(" ");
                int i = 0;
                for (; i < splittedWords.length; i++) {
                    if (splittedWords[i].length() > wordLength) {
                        wordLength = splittedWords[i].length();
                        splittedWord = splittedWords[i];

                        longestWordLine =  "Line" + " = "+count + ","+" Longest Word" + "=" +splittedWord +  "," +
                                " StartLetter" +" = "+line.charAt(0) + " " + " EndLetter" +" =" +
                                line.charAt(line.length()-1) ;
                    }

                }
                count++;
            }
            FileWriter fw = new FileWriter("statslongestword.txt");
            fw.write(longestWordLine);

            fw.close();
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
