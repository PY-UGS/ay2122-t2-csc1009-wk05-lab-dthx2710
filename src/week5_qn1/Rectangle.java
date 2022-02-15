package week5_qn1;
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, Double width, Double height) {
        super(color, filled);
        setColor(color);
        setFilled(filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Double width, Double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        
        return height * width;
    }

    public double getPerimeter(){
        return height * 2 + width * 2;
    }
    
}
