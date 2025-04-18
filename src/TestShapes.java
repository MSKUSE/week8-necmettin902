import java.awt.*;

public class TestShapes {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.describe();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        System.out.println(r1.equals(r2));


    }
}