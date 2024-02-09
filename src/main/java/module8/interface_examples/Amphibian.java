package module8.interface_examples;

// клас Amphibian реалізує інтерфейс Universal і зобов'язаний реалізувати методи всіх трьох інтерфейсів
public class Amphibian implements Universal {
    public void fly() {
        System.out.println(getName() + " fly");
    }

    public void swim() {
        System.out.println(getName() + " swim");
    }

    public String getName() {
        return "Amphibian";
    }
}
