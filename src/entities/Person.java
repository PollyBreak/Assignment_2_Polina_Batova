package entities;

public abstract class Person implements Payable, Comparable<Person>{
    private static int auto_increment_ID = 0; //helper variable to generate id
    private int id;
    private String name;
    private String surname;

    public Person() {
        auto_increment_ID++; //auto generation of id
        id = auto_increment_ID;
    }

    public Person(String name, String surname) {
        auto_increment_ID++; //auto generation of id
        id = auto_increment_ID;
        this.name = name;
        this.surname = surname;
    }

    abstract public String getPosition(); //it's abstract as depends on a concrete subclass

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Person anotherPerson) {
        return (int)(this.getPaymentAmount() - anotherPerson.getPaymentAmount()); //based on the amount of money they make
    }
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
