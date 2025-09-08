package Homework4;

public class Warrior extends GameCharacter{


    public Warrior(String name, int hp) {
        super(name, hp);
    }

    public void attack (GameCharacter target) {
        if (isAlive()) {
            receiveDamage(target, 10);
            System.out.printf(" от атаки мечём.%n");
        }

    }
}
