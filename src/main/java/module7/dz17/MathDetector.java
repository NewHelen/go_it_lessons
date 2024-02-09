package module7.dz17;

public class MathDetector {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }

    // метод приймає текст і повертає true, якщо в тексті є математичні вирази
    public boolean isMath(String text){

        char[] chars = text.toCharArray();
        char[] symbols = {'+', '-','/','*'};
        int count =0;
        boolean hasTwoDigits = false;
        boolean hasSymbol = false;
        boolean hasEqualSymbol = text.contains("=");

        for (char ch:chars) {
            for (char symbol:symbols) {
                if (ch == symbol){
                    hasSymbol = true;
                }
            }
            if (Character.isDigit(ch)){
                count ++;
            }
        }
        if (count > 1){
            hasTwoDigits = true;
        }
        return hasTwoDigits && hasSymbol && hasEqualSymbol;
    }
}
