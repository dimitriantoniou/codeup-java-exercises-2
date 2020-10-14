package shapes;

import util.Input;

public class Circle {
    //This class should have a private radius property that is set through the constructor and
    //public Circle(double radius)
    //public double getArea()
    //public double getCircumference()
    private double radius;
    public Circle(){
        radius= Input.getDouble();
        System.out.println("The area is: "+getArea());
        System.out.println("The circumference is: "+getCircumference());
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
