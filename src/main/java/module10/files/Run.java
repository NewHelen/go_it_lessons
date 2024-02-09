package module10.files;

import java.io.*;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {

        File file = new File("files/demo.txt");


        // перевірити чи файл існує
        File file1 = new File("/non/existing/file1.txt");
        System.out.println("чи файл існує: " + file1.exists());

        // шлях до цього файлу
        System.out.println("шлях до цього файлу: " + file.getPath());


        // Чи є файл директорією
        //false
        System.out.println("Чи є файл директорією " + new File("files/demo.txt").isDirectory());

        //true
        System.out.println("Чи є файл директорією " + new File("src").isDirectory());


        // записати текст (рядок) у файл:
        String text = "Hello from Output Stream";
        try(FileOutputStream fileOutputStream = new FileOutputStream("files/test.txt")) {
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // прочитати файл, зчитуємо дані по одному символу char
        try (FileReader reader = new FileReader("files/file.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // зчитувати дані блоками

        try (FileReader reader = new FileReader("files/file.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.println(Arrays.toString(buf));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
