public class Box extends Rectangle{

    private int dimension3;
    private float volume;

    public Box() {
    }

    public Box(int dimension1, int dimension2, int dimension3) {
        super(dimension1, dimension2);
        this.dimension3 = dimension3;
    }

    public int getDimension3() {
        return dimension3;
    }

    public void setDimension3(int dimension3) {
        this.dimension3 = dimension3;
    }

    public float getVolume() {
        volume = getArea() * dimension3;
        return volume;
    }
}
