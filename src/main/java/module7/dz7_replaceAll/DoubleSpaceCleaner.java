package module7.dz7_replaceAll;

public class DoubleSpaceCleaner {

    // Метод приймає на вхід рядок, і повертає його, тільки без подвійних пробілів (між кожним словом повинен залишитися рівно один пробіл).
    // Також метод повинен видалити всі пробіли на початку та в кінці рядка
    public String clean(String phrase){
         return phrase.trim().replaceAll("\\s+", " ");
    }
}
class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
