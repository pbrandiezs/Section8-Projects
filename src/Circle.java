import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }//end no-arg ctor

    public Circle(double radius){
        this.radius = radius;
    }//end ctor

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference(){
        return 2 * PI * radius;
    }

    public double area(){
        return PI * pow(radius, 2);
    }
}
