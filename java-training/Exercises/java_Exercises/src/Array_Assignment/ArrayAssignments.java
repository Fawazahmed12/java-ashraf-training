package Array_Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayAssignments {

    public static void main(String[] args) {

        printUniqueElements();
        buildEmployees();
        printSecondSmallestAndSecondLargest();

    }

    static <T> void printUniqueElements() {
        int[] arrayWithDuplicates = {12, 34, 12, 45, 67, 89};

        // implement the logic here.
        // Hint: You can use ArrayList and contains method
        // expected output [12,34,45,67,89] // Note 12 is removed

        List<Integer> arrayList = new ArrayList<>();

        for (int element : arrayWithDuplicates) {

            if (!arrayList.contains(element)) {
                arrayList.add(element);
            }
        }

        System.out.println("ArrayList with duplicates removed: " + arrayList);
    }

    static class Person {
        int id;
        String designation;
        int salary;

        public Person(int id, String designation, int salary) {
            this.id = id;
            this.designation = designation;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", designation='" + designation + '\'' +
                    ", salary=" + salary +
                    '}';
        }

    }


    static void buildEmployees() {
        int employeeId[] = {1001, 1002, 1003, 1004};
        String designation[] = {"A", "B", "A", "C"};

        Map<String, Integer> designationToSalaryMap = new HashMap<>();
        designationToSalaryMap.put("A", 10000);
        designationToSalaryMap.put("B", 75000);
        designationToSalaryMap.put("C", 50000);

        List<Integer> values = new ArrayList<>(designationToSalaryMap.values());

        List<Person> personList = new ArrayList<>();

        for( int i=0; i< employeeId.length; i++) {
            Person person1 = new Person(employeeId[i],designation[i],designationToSalaryMap.get(designation[i]));
            personList.add(person1);
        }

//
//        Person person1 = new Person(employeeId[0],designation[0],designationToSalaryMap.get("A"));
//        Person person2 = new Person(employeeId[1],designation[1],designationToSalaryMap.get("B"));
//        Person person3 = new Person(employeeId[2],designation[0],designationToSalaryMap.get("A"));
//        Person person4 = new Person(employeeId[3],designation[2],designationToSalaryMap.get("C"));
//
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//        personList.add(person4);

        System.out.println(personList);

        //create 4 person objects programatically. The salary should come from the salary Map based on the designation
    }

    static void printSecondSmallestAndSecondLargest() {
        int[] array = {19, 14, 20, 18, 2};  // 14   19
        int temp;
        int  size = array.length;

//        for(int i = 0; i<size; i++ ){
//            for(int j = i+1; j<size; j++){
//                if(array[i]>array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

        int greatestNumber = array[0];
        for (int i =1; i<array.length; i++) {
            if (array[i] > greatestNumber){
                greatestNumber = array[i];
            }
        }
        System.out.println(greatestNumber);
        

        int secondSmallestNumber = array[1];
        int secondLargestNumber = array[array.length - 2];
        System.out.println("Second Smallest element = " + secondSmallestNumber + " , " +  "Second Largest element = " + secondLargestNumber);
    }

}


