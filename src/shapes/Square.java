package shapes;

public class Square extends Rectangle{
    public Square (double side){
        super(side,side);

        //In the Square class, override the getArea and getPerimeter methods
        // with the following definitions for a square
        //perimeter = 4 x side
        //area = side ^ 2
        public double getArea(){
            return super.width*super.width;
        }
        public double getPerimeter(){
            return 4*super.width;
        }
    }
}

