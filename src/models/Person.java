package models;

public class Person implements Payable {
    private int id;
    private String name;
    private String surname;
    private static int id_gen = 1;

    private void generateID() {
        id = id_gen++;
    }

    public Person() {
        generateID();
        this.id = id;
        this.name = "Unknown";
        this.surname = "Unknown";
    }

    public Person(String name, String surname) {
        generateID();
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }

    public double getPaymentAmount() {
        return 0;
    }
}
