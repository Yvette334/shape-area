public class shape {
    double pi1=3.14;
    double rad;
    double area;
    double TriangleArea;
    double RectangleArea;

    public shape(){

    }

    public void display(){
        System.out.println("Area of Triangle is: "+TriangleArea);
        System.out.println("Area of circle is: "+area);
        System.out.println("Area of Rectangle is: "+RectangleArea);
    }
    public double calculateArea(){
        return area;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 3);
        triangle.calculateArea();
        triangle.display();
        
        Circle circle = new Circle(3.14, 2);
        circle.calculateArea();
        circle.display();

        Rectangle rectangle = new Rectangle(12, 6);
        rectangle.calculateArea();
        rectangle.display();

        


    }
}
