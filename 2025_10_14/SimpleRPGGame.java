abstract class Character {
    private String name;
    private int hp;
    private int baseDamage;
    
    public Character(String name, int hp, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHp() {
        return hp;
    }
    
    public int getBaseDamage() {
        return baseDamage;
    }
    
    public abstract void attack();
}

interface RangeAttack {
    void shootArrow();
}

interface MagicAttack {
    void castSpell();
}

class Warrior extends Character {
    public Warrior(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }
    
    @Override
    public void attack() {
        System.out.println(getName() + " (Warrior) attacks with a sword!");
    }
}

class Archer extends Character implements RangeAttack {
    public Archer(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }
    
    @Override
    public void attack() {
        shootArrow();
    }
    
    @Override
    public void shootArrow() {
        System.out.println(getName() + " (Archer) shoots an arrow!");
    }
}

class Mage extends Character implements MagicAttack {
    public Mage(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }
    
    @Override
    public void attack() {
        castSpell();
    }
    
    @Override
    public void castSpell() {
        System.out.println(getName() + " (Mage) casts a fireball!");
    }
}

class ArcaneArcher extends Character implements RangeAttack, MagicAttack {
    public ArcaneArcher(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }
    
    @Override
    public void attack() {
        shootArrow();
        castSpell();
    }
    
    @Override
    public void shootArrow() {
        System.out.println(getName() + " (ArcaneArcher) shoots an arrow!");
    }
    
    @Override
    public void castSpell() {
        System.out.println(getName() + " also casts a magic spell!");
    }
}

public class SimpleRPGGame {
    public static void main(String[] args) {
        Character[] characters = new Character[4];
        
        characters[0] = new Warrior("Arthur", 150, 30);
        characters[1] = new Archer("Legolas", 100, 25);
        characters[2] = new Mage("Gandalf", 80, 40);
        characters[3] = new ArcaneArcher("Sylvanas", 120, 35);
        
        System.out.println("=== Game Start ===\n");
        
        for (Character character : characters) {
            System.out.println("Character: " + character.getName());
            System.out.println("HP: " + character.getHp());
            System.out.println("Base Damage: " + character.getBaseDamage());
            character.attack();
            System.out.println();
        }
        
        System.out.println("=== Game End ===");
    }
}   