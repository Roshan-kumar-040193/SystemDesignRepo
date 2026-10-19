package DesignPatterns;

//eg- java.util.Comparator.compare() uses this design pattern

public class StrategyDesignPattern {
    public static void main(String[] args){
        RolePlayers king = new King(new SwordBehaviour());
        RolePlayers queen = new Queen(new KnifeBehaviour());   // Fixed
        RolePlayers knight = new Knight(new AxeBehaviour());   // Fixed
        RolePlayers troll = new Troll(new ClubBehaviour());     // Fixed

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();
    }
}

abstract class RolePlayers{
    WeaponBehaviour weaponBehaviour;

    public RolePlayers(WeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }

    abstract void fight();
}

class King extends RolePlayers{
    public King(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
    }

    @Override
    void fight() {
        System.out.println("King " + weaponBehaviour.useWeapon());
    }
}

class Queen extends RolePlayers{
    public Queen(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
    }

    @Override
    void fight() {
        System.out.println("Queen " + weaponBehaviour.useWeapon()); // Fixed label
    }
}

class Knight extends RolePlayers{
    public Knight(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
    }

    @Override
    void fight() {
        System.out.println("Knight " + weaponBehaviour.useWeapon()); // Fixed label
    }
}

class Troll extends RolePlayers{
    public Troll(WeaponBehaviour weaponBehaviour) {
        super(weaponBehaviour);
    }

    @Override
    void fight() {
        System.out.println("Troll " + weaponBehaviour.useWeapon()); // Fixed label
    }
}

interface WeaponBehaviour{
    String useWeapon();
}

class KnifeBehaviour implements WeaponBehaviour{
    @Override
    public String useWeapon() {
        return "Uses Knife as Weapon"; // Returns String instead of printing directly
    }
}

class SwordBehaviour implements WeaponBehaviour{
    @Override
    public String useWeapon() {
        return "Uses Sword as Weapon";
    }
}

class AxeBehaviour implements WeaponBehaviour{
    @Override
    public String useWeapon() {
        return "Uses Axe as Weapon";
    }
}

class ClubBehaviour implements WeaponBehaviour{
    @Override
    public String useWeapon() {
        return "Uses Club as Weapon";
    }
}