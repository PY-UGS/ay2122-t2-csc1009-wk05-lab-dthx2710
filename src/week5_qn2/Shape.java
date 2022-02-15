package week5_qn2;
public abstract class Shape{
    private double height;
    private double width;
    private double radius;
    private double shortRadius;
    private double longRadius;

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getShortRadius() {
        return this.shortRadius;
    }

    public void setShortRadius(double shortRadius) {
        this.shortRadius = shortRadius;
    }

    public double getLongRadius() {
        return this.longRadius;
    }

    public void setLongRadius(double longRadius) {
        this.longRadius = longRadius;
    }

    public abstract double getArea();

    public String toString(){
        String Classname = this.getClass().getSimpleName();
        return "Inside Area for " + Classname + "\n";
    }
}