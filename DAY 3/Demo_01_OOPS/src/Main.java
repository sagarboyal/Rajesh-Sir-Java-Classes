import org.w3c.dom.css.Rect;

import javax.security.sasl.RealmChoiceCallback;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        System.out.println("Area of rectangle : "+rect.getArea());

        Triangle tri = new Triangle();
        tri.setDimension1(10);
        tri.setDimension2(20);
        System.out.println("Area of triangle : "+tri.getArea());


        Box box = new Box(10,20,30);

        System.out.println("Volume of box : "+box.getVolume());
    }
}