package ImperativeApproach_FunctionalApproach;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<String> c1 = new ArrayList<>();
        c1.add("Welcome, Home");
        c1.add("Hello, Sundar");
        c1.add("Welcome, India");
        c1.stream()
                .filter((p)->p.startsWith("Welcome"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p)  -> System.out.println(p));
    }
}
