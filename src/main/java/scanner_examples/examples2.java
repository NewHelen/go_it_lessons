package scanner_examples;

import java.util.Scanner;

public class examples2 {

    public static void main(String[] args) {

        /**
         * завдання Scanner
         */
        Scanner in = new Scanner(System.in); //Створили об'єкт Scanner
        System.out.print("Input a number: "); //Попросили користувача ввести число
        int num1 = in.nextInt(); //Прочитали число
        int num2 = in.nextInt(); //Прочитали число
        System.out.println("Your number is " + num1); //Вивели число
        in.close(); //Закрили об'єкт scanner - остання операція

        System.out.println((num1+num2) + " " + (num1-num2) + " " + (num1*num2) + " "+ (num1/num2));

        //_____________________________________________
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a name: ");
        String name = scanner.nextLine();

        System.out.print("Input a surname: ");
        String surname = scanner.nextLine();

        System.out.print("Input a age: ");
        int age = scanner.nextInt();

        System.out.println(name + " " + surname + " " + age * 10);
        System.out.println(name.toUpperCase());
        System.out.println(surname.toUpperCase());

        String strAge = Integer.toString(age * 10);
        System.out.println(strAge);

        System.out.println();
        scanner.close();

        //_____________________________________________
        boolean val1 = in.nextBoolean();
        boolean val2 = in.nextBoolean();
        boolean val3 = in.nextBoolean();
        System.out.println((val1 && val2 && val3) + " " + (val1 || val2 || val3));

        in.close();

    }
}
