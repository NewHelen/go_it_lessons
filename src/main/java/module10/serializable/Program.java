package module10.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// зберегти об'єкт класу Person у файл з ім'ям person.dat
public class Program {
    public static void main(String[] args) {

        // Для серіалізації об'єктів у потік використовується клас ObjectOutputStream.
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/person.dat"))) {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }


        // десеріалізувати збережений раніше об'єкт типу Person з файлу person.dat
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/person.dat"))) {
            Person p = (Person) ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        } catch(Exception ex) {
            ex.printStackTrace();
        }


    }
}
