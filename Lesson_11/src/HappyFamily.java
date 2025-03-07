import java.util.Set;

enum Species {
    DOG, DOMESTIC_CAT, FISH, ROBO_CAT, UNKNOWN;
}

interface Foul {
    void foul();
}

abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
        this.species = this.assignSpecies();
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    protected abstract Species assignSpecies();

    public void eat() {
        System.out.println(nickname + " is eating.");
    }

    public abstract void respond();
}

class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    protected Species assignSpecies() {
        return Species.FISH;
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " is swimming quietly.");
    }

    private String getNickname() {
        return "Fish";
    }
}

class DomesticCat extends Pet implements Foul {
    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    protected Species assignSpecies() {
        return Species.DOMESTIC_CAT;
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " is purring.");
    }

    @Override
    public void foul() {
        System.out.println(getNickname() + " made a mess.");
    }

    private String getNickname() {
        return "DomesticCat";
    }
}

class Dog extends Pet implements Foul {
    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    protected Species assignSpecies() {
        return Species.DOG;
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " is wagging its tail.");
    }

    @Override
    public void foul() {
        System.out.println(getNickname() + " dug a hole.");
    }

    private String getNickname() {
        return "Dog";
    }
}

class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    protected Species assignSpecies() {
        return Species.ROBO_CAT;
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " is blinking its LED eyes.");
    }

    private String getNickname() {
        return "RoboCat";
    }
}

class Human {
    private String name;
    private int age;
    private Pet pet;

    public Human(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public void greetPet() {
        System.out.println(name + " says hello to " + pet);
    }
}

final class Man extends Human {
    public Man(String name, int age, Pet pet) {
        super(name, age, pet);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey buddy, how are u?");
    }

    public void repairCar() {
        System.out.println("Man is repairing the car.");
    }
}

final class Woman extends Human {
    public Woman(String name, int age, Pet pet) {
        super(name, age, pet);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello my dear pet!");
    }

    public void makeup() {
        System.out.println("Woman is applying makeup.");
    }
}

public class HappyFamily {
    public static void main(String[] args) {
        Pet dog = new Dog("Bobik", 5, 75, Set.of("playing", "barking"));
        Man man = new Man("Isma", 30, dog);
        Woman woman = new Woman("Jennifer", 28, dog);

        dog.eat();
        dog.respond();
        ((Foul) dog).foul();

        man.greetPet();
        man.repairCar();

        woman.greetPet();
        woman.makeup();
    }
}
