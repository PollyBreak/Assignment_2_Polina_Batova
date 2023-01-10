package app;

import entities.Employee;
import entities.Person;
import entities.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Person> persons = new ArrayList<>(); // I chose Person in generics as Person is both Payable and Comparable

        persons.add(new Employee("John", "Lennon", "singer", 27045.78));
        persons.add(new Employee("George", "Harrison", "musician", 50000));
        persons.add(new Student("Ringo", "Starr", 2.55));
        persons.add(new Student("Paul", "McCartney", 3.33));
        persons.add(new Employee("Yoko", "Ono", "singer", 34700));
        persons.add(new Student("Bill", "Gates", 3.77));
        persons.add(new Student("Ed", "Sheeran", 2.67));
        persons.add(new Employee("Thomas", "Hanks", "artist", 79000));

        Collections.sort(persons); //sorting by the amount of money persons make
        printData(persons);
    }

    public static void printData(Iterable<Person> persons){  //print how much persons make in tenge
        for (Person p: persons){
            System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge");
        }
    }

}