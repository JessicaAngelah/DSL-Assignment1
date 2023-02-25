abstract class Shape {
    String color;
    abstract int getArea();
    public Shape(String color){
        this.color = color;
    }

}

class Rectangle extends Shape {
    int width;
    int height;
    public Rectangle(int width, int height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public int getArea(){
        return this.height * this.width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle bentuk = new Rectangle (80,50,"Black");
        System.out.println("Area of Rectangle : Width x Height = " + bentuk.getArea()  );
    }
}
