package week5_qn2;
public class Ellipse extends Shape{
    public Ellipse(double shortRadius, double longRadius) {
        super();
        setLongRadius(longRadius);
        setShortRadius(shortRadius);
    }

    @Override
    public double getArea(){
        return getLongRadius() * getShortRadius() * Math.PI;
    }
}
