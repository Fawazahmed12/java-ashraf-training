
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    static final List<String> DAYS = Arrays.asList("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    private int index;

    Exercise1(String day) {
        index = indexFromDay(day);
    }

    Exercise1 next() {
        int nextIndex = index + 1;
        nextIndex = nextIndex % DAYS.size(); // Modulus operator
        String dayValue = dayFromIndex(nextIndex);
        return new Exercise1(dayValue);
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
        Exercise1 friday = new Exercise1("Fri");
        Exercise1 tuesday = new Exercise1("Tue");

        friday.next(); // sat
        friday.next(); // sun
        friday.next(); // mon
        friday.next(); // tue

        System.out.println(friday);   // friday

        tuesday = tuesday.next(); //wed
        tuesday = tuesday.next(); //thu
        tuesday = tuesday.next(); //fri

        System.out.println(tuesday);  //fri

    }
}