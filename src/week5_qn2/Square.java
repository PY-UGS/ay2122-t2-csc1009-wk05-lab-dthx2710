package week5_qn2;
public class Square extends Shape{
    public Square(double height, double width) {
        super();
        setHeight(height);
        setWidth(width);
    }
    
    @Override
    public double getArea(){
        return getHeight() * getWidth();
    }
    
}