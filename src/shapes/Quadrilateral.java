package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    //protected properties for length and width.
    protected double length;
    protected double width;
    //a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double length, double width){
        this.length=length;
        this.width=width;
    }
    //methods for getting the length and width.
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    //abstract methods for setting the length and width
    public void setLength(){
        this.length=length;
    }
    public void setWidth(){
        this.width=width;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}
