package shapes;

public class Rectangle {
    //It should have protected properties for both length and width.
    // Rectangle should define a constructor that accepts two numbers for length and width,
    // and sets those properties.
    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    //Create two methods on the Rectangle class, getArea and getPerimeter
    public int getPerimeter(){
        int perimeter = 2*length+2*width;
        System.out.println("The area is: "+perimeter);
        return perimeter;
    }

    // that return the respective values. The formulas for both follow:
}
