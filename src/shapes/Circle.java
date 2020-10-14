package shapes;

public class Circle {
    //This class should have a private radius property that is set through the constructor and
    //public Circle(double radius)
    //public double getArea()
    //public double getCircumference()
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public double getCircumference(){
        double circumference = 2*Math.PI*radius;
        return circumference;
    }

}
