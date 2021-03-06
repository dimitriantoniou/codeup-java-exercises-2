package shapes;

public class ShapesTest {
    public static void main (String[] args){
        //create a variable of the type Rectangle named box1
        // and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(4,5);
        //verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        box1.getArea();
        box1.getPerimeter();

        //create a variable of the type Rectangle named box2
        // and assign it a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(5);
        //verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        box2.getArea();
        box2.getPerimeter();
    }
}
