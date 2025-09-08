package Homework4;

public class Mage extends GameCharacter{

    public Mage(String name, int hp) {
        super(name, hp);
    }

    public void attack(GameCharacter target) {
        if (isAlive()) {
            if (target.hp >= 50) {
                receiveDamage(target, 12);
                System.out.printf(" от атаки заклинанием.%n");
            } else {
                receiveDamage(target, 8);
                System.out.printf(" от атаки заклинанием.%n");
            }
        }

    }
}
