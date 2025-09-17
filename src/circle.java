import java.awt.*;

class Circle extends shape {
    double radius;
    double pi = Math.PI;

    public Circle(double pi,double radius){
        super();
        this.radius=radius;
        this.pi=pi;
    }
    @Override
    public void display() {
        System.out.println("Circle:" +area);
    }

    @Override
    public double calculateArea(){
        area = pi *  (radius * radius);
        return area;
    }
}