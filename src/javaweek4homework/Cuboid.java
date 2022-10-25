package javaweek4homework;

import java.awt.Rectangle;

public class Cuboid extends Rectangle { private double height;
    public Cuboid(double width, double length, double height) {
        super((int) width, (int) length);
        this.height = height < 0 ? 0: height;
    }
    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }

    private double getArea() {

        return 0;
    }

}

