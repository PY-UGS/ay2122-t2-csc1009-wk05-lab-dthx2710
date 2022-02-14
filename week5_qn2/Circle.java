package week5_qn2;
public class Circle extends Shape{
    public Circle(double radius){
        super();
        setRadius(radius);
    }

    @Override
    public double getArea(){
       return getRadius() * getRadius() * Math.PI;
    }
}
