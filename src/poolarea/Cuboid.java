package poolarea;

public class Cuboid extends Rectangle {

    public Cuboid(double width, double length, int i) {
        super(width, length);
        this.height = height < 0 ? 0: height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }
}



