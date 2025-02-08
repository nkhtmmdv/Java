import java.util.Arrays;

class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    public Pet() {}

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }
}

class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        String slyness = (pet.trickLevel > 50) ? "very sly" : "almost not sly";
        System.out.println("I have an " + pet.species + " is " + pet.age + " years old, he is " + slyness);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "null") +
                ", father=" + (father != null ? father.name + " " + father.surname : "null") +
                ", pet=" + pet + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Janet", "aabb", 1950);
        Human father = new Human("Vitya", "aabb", 1945);
        Human child = new Human("Misha", "aabb", 1977, 90, pet, mother, father, null);

        System.out.println(child);

        child.greetPet();
        child.describePet();
        pet.eat();
        pet.respond();
        pet.foul();
    }
}
