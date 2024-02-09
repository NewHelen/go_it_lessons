package module9.generics;

public class KeyValueTest {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> javaSalary = new KeyValuePair<>();
        javaSalary.setKey("Java");
        javaSalary.setValue(5000);
        System.out.println(javaSalary);
    }
}
