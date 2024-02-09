package module6.dz5;

public class BFG {
    private int ammo;
    private int damage;
    private String name;

    //конструктор 1
    public BFG(int ammo, int damage, String name){
        this.ammo = ammo;
        this.damage = damage;
        this.name = name;
    }

    //конструктор 2 - визиваемо в середині конструктор 1
    public BFG(int ammo, int damage){
        this(ammo,damage,"BFG");
    }

    //конструктор 3 - визиваемо в середині конструктор 1
    public BFG(int ammo){
        this(ammo,50,"BFG");
    }

    //конструктор 4 - визиваемо в середині конструктор 1
    public BFG(){
        this(1000,50,"BFG");
    }

    @Override
    public String toString() {
        return name +", ammo: "+ ammo + ", damage: "+ damage;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
