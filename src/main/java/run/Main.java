package run;

import module4.*;
import module5.dz10.Engine;
import module5.dz10.XFuelEngine;
import module5.dz12.Passenger;
import module5.dz12.RegularPassenger;
import module5.dz12.VIPPassenger;
import module5.dz13.JupiterStar;
import module5.dz13.LaunchCalculator;
import module5.dz18.SpaceUtils;
import module5.dz20.Point;
import module5.dz25.Mars;
import module5.dz25.Moon;
import module5.dz25.PlanetTester;
import module6.dz1.Hero;
import module6.dz13.QuarkeTrack;
import module6.dz14.Rectangle;
import module6.dz17.Level;
import module6.dz25.AvgDamageCalculator;
import module6.dz26.ArrayWorker;
import module6.dz27.AIPlayer;
import module6.dz5.BFG;
import module6.dz8.PowTable;

import java.util.Arrays;

public class Main {

    public static String encode(String name) {

        return "NOTFORYOU" +
                name.replace('e', '1')
                        .replace('u', '2')
                        .replace('i', '3')
                        .replace('o', '4')
                        .replace('a', '5') +
                "YESNOTFORYOU";
    }

    public static String decode(String name) {

        return name.substring(9, name.length() - 12).replace('1', 'e')
                .replace('2', 'u')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'a');
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }


    // приймає масив рівно з 5 елементів, і повертає масив рівно з 3-х елементів
    public String[] changeElectResultAgain(String[] results){
        String[] arrTarget = new String[3];
        System.arraycopy(results, 2, arrTarget, 0, 3);
    // масив откуда - индекс откуда - масив куда - индекс куда - длина
        return arrTarget;
    }

    public static char[][] createKeyboard(){

        char[][] chessboard = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        return chessboard;
    }


    public static void printKeyboard(){
        System.out.println("new array");
        char[][] chessboard = createKeyboard();

        for (char[] row : chessboard) {
            System.out.println(Arrays.toString(row));
        }
    }

    public String[] makeCopy(String[] names){

        String[] copy = Arrays.copyOf(names, names.length);

        System.out.println("Copied!");
        return copy;
    }

    public String aggregateSingle(String name, String age, String planet){

        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets){

        String[] arrTarget = new String[3];
        arrTarget[0] = aggregateSingle(names[0], Integer. toString(ages[0]), planets[0]);
        arrTarget[1] = aggregateSingle(names[1], Integer. toString(ages[1]), planets[1]);
        arrTarget[2] = aggregateSingle(names[2], Integer. toString(ages[2]), planets[2]);
        return arrTarget;
    }

    public int calculateNeededFuel(int distance){
        if (distance > 20){
            System.out.println("dis " + distance);
            return 1000;
        }else {
            return (distance-distance)*5+1000;
        }
    }


    public static String getMyPrizes(int ticket){


        int copy = ticket;
        String str =Integer.toString(copy);
        char ch = str.charAt(str.length()-1);

        if (ticket % 10==0){
            return  (ticket>200)? "crystall coin":"crystall";

        } else if ( ch=='7') {
            return  (ticket>200)? "chip coin":"chip";

        } else if (ticket > 200) {
            return "coin";
        }else {
            return " ";
        }

    }

    public boolean isHangarOk(int side1, int side2, int price){

        int area = side1 * side2;

        // Перевіряємо, чи площа більша за 1500 квадратних метрів
        if (area >= 1500) {
            // Знаходимо більшу та меншу сторони
            int longerSide = Math.max(side1, side2);
            int shorterSide = Math.min(side1, side2);

            // Перевіряємо, чи довша сторона не більше ніж у два рази більша за меншу
            if (longerSide <= shorterSide * 2) {
                // Обчислюємо ціну квадратного метра ангару
                double pricePerSqMeter = price / (double) area;

                // Перевіряємо, чи ціна квадратного метра не більше 1000 доларів
                if (pricePerSqMeter <= 1000) {
                    return true; // Відповідає усім умовам
                }
            }
        }
        return false;
    }

    public static void printPrices(float[] prices) {

        for (float el: prices){
            System.out.println(el + " jup.");
        }
    }

    public static void multiplyPrices(float[] prices){

        for (int i = 0; i < prices.length; i ++){
            if (prices[i]<1000){
                prices[i] = prices[i]*2;
            }else {
                prices[i] = prices[i]*1.5f;
            }
        }
    }

    public int[] findMinMaxPrices(int[] prices){

        if (prices.length ==0){
            return prices;
        } else {
                var min = Arrays.stream(prices).min();
                var max = Arrays.stream(prices).max();

                if (min.getAsInt()==max.getAsInt()){
                    return new int[]{min.getAsInt()};
                }else if(prices.length !=1){
                    return new int[]{min.getAsInt(), max.getAsInt()};
                    }
            }
        return null;
        }

    private String language;
    private String text;

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    public static void main(String[] args) {

        /**
         * завдання 27 (module 6) - обробка винятків try...catch
         */
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        /**
         * завдання 26 (module 6) - обробка винятків try...catch
         */
        int[] array = {1, 2, 3};

        //value is 1
        //index is 0
        new ArrayWorker().printElement(array, 0);

        //wrong index
        //index is 10
        new ArrayWorker().printElement(array, 10);

        /**
         * завдання 25 (module 6) - обробка винятків try...catch
         */
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));


        /**
         * завдання 17 (module 6)
         */
        Level.Point p11 = new Level.Point(3, 5);
        Level.Point p22 = new Level.Point(10, 100);
        Level.Point p33 = new Level.Point(50, 40);

        Level.Point[] points = {p11, p22, p33};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());

        /**
         * завдання 14 (module 6) - перевірити чи можно поточний прямокутник вписати у anotherRect
         */
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        // r1 - поточний прямокутник(this) на якому визиваем метод, r2 - той, що передаем у метод
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));

        System.out.println("---------");
        /**
         * завдання 13 (module 6) - перевизначення метода equals()
         */
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());


        /**
         * завдання 8 (module 6) - дописати статичний блок
         */
        System.out.println(Arrays.toString(PowTable.POWERS_2));

        /**
         * завдання 5 (module 6) - конструктор в конструкторі
         */
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

        /**
         * завдання 1-2 (module 6) - конструктор
         */
        Hero hero = new Hero("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());

        /**
         * завдання 25 (module 5)- Оператор instanceof (дізнатись да якого класу належить обект)
         */
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be "planet"
        System.out.println(tester.test(new Moon())); //Should be "not planet"

        /**
         * завдання 20 (module 5)- перевизначення метода equals()
         */
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
        System.out.println(p1.hashCode() == p2.hashCode()); //Should be true
        System.out.println(p1.hashCode() == p3.hashCode()); //Can be true or false

        /**
         * завдання 18 (module 5)-константи
         */
        System.out.println(SpaceUtils.PLANET_COUNT);

        /**
         * завдання 13 (module 5)-абстрактні класи / перевизначення @Override
         */
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        /**
         * завдання 12 (module 5)-абстрактні класи / перевизначення @Override
         */
        Passenger regular = new RegularPassenger();
        System.out.println(regular.getType()); //Regular
        System.out.println(regular.getTicketPrice()); //199

        Passenger vip = new VIPPassenger();
        System.out.println(vip.getType());  //VIP
        System.out.println(vip.getTicketPrice()); //399

        /**
         * завдання 8 (module 5)
         */
        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel

        /**
         * завдання 5 (module 4)
         */
        Dz5 shop = new Dz5();
        //Should be [150, 200]
        int[] prices = new int[]{150, 100, 200};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));

        /**
         * завдання 6 (module 4)
         */
        Dz6 shop2 = new Dz6();
        //Should be [1599, 399]
        int[] prices2 = new int[] {399, 1599, 399, 50, 10, 10, 70};
        System.out.println(Arrays.toString(shop2.leavePrice9(prices2)));

        /**
         * завдання 7 (module 4)
         */
        Dz7 shop7 = new Dz7();
        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[] {"gun", "firebow"};
        String[] warehouseStocks = new String[] {"firegun"};
        System.out.println(Arrays.toString(shop7.mergeStocks(showcaseStocks, warehouseStocks)));

        /**
         * завдання 8 (module 4)
         */
        Dz8 shop8 = new Dz8();
        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices8 = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop8.getPricesSum(prices8, 20, 50));

        /**
         * завдання 17 (module 4)
         */
        Dz17 shop17 = new Dz17();
        int sum = 576;
        System.out.println(shop17.countBanknotes(sum));


        /**
         * comments
         *
         */
        System.out.println("First\tline");   //Надрукується кілька (як правило 4) пробіли
        System.out.println("Second\nline\nlines");  //Перехід на новий рядок
        System.out.println("3\'line");  //Символ одинарної лапки
        System.out.println("4\"line");  //символ подвійної лапки
        System.out.println("5\\line");  //Символ зворотної скісної риски

    }
}
