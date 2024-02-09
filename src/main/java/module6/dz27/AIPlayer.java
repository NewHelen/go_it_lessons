package module6.dz27;

public class AIPlayer {
    private int hp;

    public void setHp(int hp) {
        if (hp >= 0 && hp <= 100){
            this.hp = hp;
        } else {
            // кидати виняток і завершувати програму, якщо хтось передав неправильне значення в сеттер
            throw new IllegalArgumentException();
        }
    }

}
