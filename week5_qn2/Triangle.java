package week5_qn2;
public class Triangle extends Shape{
    public Triangle(double height, double width){
        super();
        setHeight(height);
        setWidth(width);
    }

    @Override
    public double getArea(){
        return (getHeight() * getWidth()) / 2;
    }
}