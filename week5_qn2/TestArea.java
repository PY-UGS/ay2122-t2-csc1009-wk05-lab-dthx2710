package week5_qn2;
public class TestArea{
    public static void main(String[] args){

        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);
        
        Shape figref;
        figref = r;
        System.out.print(r.toString());
        System.out.printf("Area is %.2f\n", figref.getArea());
        
        figref = t;
        System.out.print(t.toString());
        System.out.printf("Area is %.2f\n", figref.getArea());

        figref = c;
        System.out.print(c.toString());
        System.out.printf("Area is %.2f\n", figref.getArea());

        figref = e;
        System.out.print(e.toString());
        System.out.printf("Area is %.2f\n", figref.getArea());

        figref = s;
        System.out.print(s.toString());
        System.out.printf("Area is %.2f\n", figref.getArea());
    }
}
