package assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] arg) {
        Employee employee0 = new Employee("John", "Lennon", "Teacher", 80000.00);
        Employee employee1 = new Employee("George", "Harrisson", "Professor", 90000);
        Student student0 = new Student("Ringo", "Star", 2.22);
        Student student1 = new Student("Paul", "McCartney", 3.99);
        ArrayList<Person> ppl = new ArrayList<>();
        ppl.add(employee0);
        ppl.add(employee1);
        ppl.add(student0);
        ppl.add(student1);

        Collections.sort(ppl);
        printData(ppl);
    }
    public static void printData(Iterable<Person> ppl){
        for (Person person : ppl ) {
            if (person instanceof Employee){
                System.out.println(person + " Position: " + person.getPosition() + ". earns: " + person.getPaymentAmount() + " tg");
            } else if (person instanceof Student) {
                System.out.println(person.toString() + " earns " + person.getPaymentAmount() + "tg");

            }
        }
    }
}
