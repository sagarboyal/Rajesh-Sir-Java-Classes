public class Rectangle extends Shape{

    private float area;

    public Rectangle() {
        super();
    }

    public Rectangle(int dimension1, int dimension2) {
        super(dimension1, dimension2);
        this.area = dimension1 * dimension2;
    }

    public float getArea() {
        area = getDimension1() * getDimension2();
        return area;
    }
}
