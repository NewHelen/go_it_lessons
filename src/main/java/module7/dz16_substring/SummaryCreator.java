package module7.dz16_substring;

public class SummaryCreator {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }

    // обрізати текст
    public String create(String text){

        if (text.length() <= 15){

            return text;
        } else {
            if(' ' == text.charAt(15)){
                return text.substring(0,15);
            }else {
                return text.substring(0,15) +"...";
            }
        }

    }
}
