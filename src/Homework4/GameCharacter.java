package Homework4;

public abstract class GameCharacter {
    private String name;
    protected int hp;

    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void attack(GameCharacter target);

    public boolean isAlive() {
        return hp > 0;
    }

    public void receiveDamage(GameCharacter target ,int dmg) {
        if (target.hp - dmg > 0) {
            target.hp -= dmg;
            System.out.print(target.name + " " + target.hp + "hp: -" + dmg + "hp");
        } else {
            target.hp = 0;
            System.out.print(target.name + " умер");
        }
    }

    public static void main(String[] args) {
        GameCharacter knight = new Warrior("Bob", 100);
        GameCharacter magician = new Mage("Mag", 100);

        for (int i = 0; i < 10; i++) {
            knight.attack(magician);
            magician.attack(knight);
        }


    }
}
