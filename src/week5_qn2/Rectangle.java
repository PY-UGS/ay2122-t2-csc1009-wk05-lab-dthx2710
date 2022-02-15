package week5_qn2;
public class Rectangle extends Shape{
    public Rectangle(double height, double width){
        super();
        setHeight(height);
        setWidth(width);
    }

    public double getArea(){
        return getHeight() * getWidth();
    }
}
