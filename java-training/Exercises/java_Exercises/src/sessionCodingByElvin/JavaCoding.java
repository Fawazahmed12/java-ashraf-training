package sessionCodingByElvin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaCoding {

        public static void main(String[] args) {

            List<Person> personList = new ArrayList<Person>();

            personList.add(new Person(1,"elvin",25));
            personList.add(new Person(2,"arun",26));
            personList.add(new Person(3,"isac",25));
            personList.add(new Person(4,"alagu",27));

            System.out.println(personList);
            Map<Integer,String> productPriceMap =
                    personList.stream()
                             .filter(p->p.age>25)
                            .collect(Collectors.toMap(p->p.id, p->p.name));

            System.out.println(productPriceMap);

        }

}
