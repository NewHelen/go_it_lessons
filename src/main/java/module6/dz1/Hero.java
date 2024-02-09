package module6.dz1;

public class Hero {
    String name;
    int hp;

    public Hero (){
        this("Paratrooper",100);
    }

    public Hero(String name, int hp) {
        this.name = name;
        if (hp >0 && hp <= 200){
            this.hp = hp;
        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }


}
