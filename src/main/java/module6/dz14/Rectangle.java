package module6.dz14;

public class Rectangle {
    private int a,b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect){

        //прямокутник anotherRect (той, що передаем у метод)
        int min = Math.min(anotherRect.a, anotherRect.b);
        int max = Math.max(anotherRect.a, anotherRect.b);

        //поточний прямокутник (на якому визиваем метод)
        int min2 = Math.min(this.a,this.b);
        int max2 = Math.max(this.a,this.b);

        if (min2 <= min && max2 <= max){
            return true;
        }
        return false;
    }
}
