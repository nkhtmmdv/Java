package lesson6;

public abstract class Human {
    protected String name;
    protected String surname;
    protected int age;
    protected String email;
    protected String phoneNumber;

    public Human() {}

    public Human(String name, String surname, int age, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}

