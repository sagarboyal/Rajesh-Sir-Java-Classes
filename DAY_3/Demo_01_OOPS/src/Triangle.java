public class Triangle extends Shape{

    private float area;

    public float getArea() {
        area = 0.5f * getDimension1() * getDimension2();
        return area;
    }
}
