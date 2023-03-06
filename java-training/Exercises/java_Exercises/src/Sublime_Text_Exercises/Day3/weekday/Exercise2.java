package Sublime_Text_Exercises.Day3.weekday;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {
    static final List<String> DAYS = Arrays.asList("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    private int index;

    Exercise2(String day) {
        index = indexFromDay(day);
    }

    void  next() {
        int nextIndex = index + 1;
        nextIndex = nextIndex % DAYS.size(); // Modulus operator
        this.index = nextIndex;
    }

    public String toString() {
        return dayFromIndex(index);
    }

    private String dayFromIndex(int index) {
        return DAYS.get(index);
    }

    private int indexFromDay(String day) {
        return DAYS.indexOf(day);
    }


    public static void main(String[] args) {
        Exercise2 friday = new Exercise2("Fri");
        Exercise2 tuesday = new Exercise2("Tue");

        friday.next(); // sat
        System.out.println(friday);
        friday.next(); // sun
        friday.next(); // mon
        friday.next(); // tue

        System.out.println(friday);   // Tue

    }
}
