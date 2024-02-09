package module10.serializable;

import java.io.Serializable;

// Серіалізувати можна лише ті об'єкти, які реалізують інтерфейс Serializable (інтерфейс не має жодних методів)
public class Person implements Serializable {
    private String name;
    private int age;
    // щоб виключити із серіалізації поля - потрібно оголосити з модифікатором `transient
    private transient double height;
    private transient boolean married;

    Person(String name, int age, double height, boolean married){
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMarried() {
        return married;
    }
}
