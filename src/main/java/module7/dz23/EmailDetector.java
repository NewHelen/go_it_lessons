package module7.dz23;

public class EmailDetector {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }

    public boolean isPresent(String text){

        for (int i = 0; i < text.toCharArray().length; i++) {
            if (text.toCharArray()[i]=='@'){
                if (!Character.isSpaceChar(text.toCharArray()[i+1])&&
                !Character.isSpaceChar(text.toCharArray()[i+2])&&
                !Character.isSpaceChar(text.toCharArray()[i-1])&&
                !Character.isSpaceChar(text.toCharArray()[i-2])){
                    return true;
                }
            }
        }
        return false;
    }


//    public boolean isPresent(String text) {
//        // Використовуємо регулярний вираз для пошуку email
//        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(text);
//
//        // Перевіряємо, чи є в тексті відповідний email
//        return matcher.find();
//    }


}
