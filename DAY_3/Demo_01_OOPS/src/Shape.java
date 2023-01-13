public class Shape {
    private int dimension1,dimension2;

    public Shape() {
        dimension1 = dimension2 =0;
    }

    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public int getDimension1() {
        return dimension1;
    }

    public void setDimension1(int dimension1) {
        this.dimension1 = dimension1;
    }

    public int getDimension2() {
        return dimension2;
    }

    public void setDimension2(int dimension2) {
        this.dimension2 = dimension2;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "dimension1=" + dimension1 +
                ", dimension2=" + dimension2 +
                '}';
    }
}
