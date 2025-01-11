import models.Person;
import models.Student;
import models.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Diana", "Sabulla"));
        persons.add(new Employee("Somebody", "Some", "Professor", 200000.0));
        persons.add(new Student("Anybody", "Any", 3.1));

        for (Person person : persons) {
            System.out.println(person);
            System.out.println("Payment Amount: " + person.getPaymentAmount());
        }
    }
}