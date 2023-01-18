import java.util.Arrays;
import java.util.List;

public class Weekday {
    static final List<String> DAYS = Arrays.asList("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    private int index;

    Weekday(String day) {
        index = indexFromDay(day);
    }

    Weekday next() {
        int nextIndex = index + 1;
        nextIndex = nextIndex % DAYS.size(); // Modulus operator
        String dayValue = dayFromIndex(nextIndex);
        return new Weekday(dayValue);
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
        Weekday friday = new Weekday("Fri");
        Weekday tuesday = new Weekday("Tue");

        friday.next();
        friday.next();
        friday.next();
        friday.next();

        System.out.println(friday);

        tuesday = tuesday.next();
        tuesday = tuesday.next();
        tuesday = tuesday.next();

        System.out.println(tuesday);

    }

}