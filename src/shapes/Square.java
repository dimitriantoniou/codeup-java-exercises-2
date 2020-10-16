package shapes;

public class Square extends Rectangle{
    public Square (double side){
        super(side,side);
        this.length=side;
        this.width=side;

        //In the Square class, override the getArea and getPerimeter methods
        // with the following definitions for a square
        //perimeter = 4 x side
        //area = side ^ 2
        public double getArea(){
            double area =  side*side;
            System.out.println("The area is: "+area);
        }
        public double getPerimeter(){
            double perimeter = 4*side;
            System.out.println("The perimeter is: "+perimeter);
        }
    }
}
