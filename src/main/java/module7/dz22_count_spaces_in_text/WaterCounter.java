package module7.dz22_count_spaces_in_text;

public class WaterCounter {

    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }

    //приймає рядок і повертає відношення кількості пробілів у тексті /до загальної кількості символів
    public double count(String text){

        int countSpaces = 0;
        double textLength = text.toCharArray().length;

        for (char ch:text.toCharArray()) {
            if (Character.isSpaceChar(ch)){
                countSpaces++;
            }
        }

        return countSpaces/textLength;
    }
}
