package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    /* inheritance and polymorphism code
    //It should have protected properties for both length and width.
    // Rectangle should define a constructor that accepts two numbers for length and width,
    // and sets those properties.
    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    //Create two methods on the Rectangle class, getArea and getPerimeter
    // that return the respective values.
    public double getPerimeter(){
        double perimeter = 2*length+2*width;
        System.out.println("The perimeter is: "+perimeter);
        return perimeter;
    }
    public double getArea(){
        double area = length*width;
        System.out.println("The area is: "+area);
        return area;
    }

     */
}
