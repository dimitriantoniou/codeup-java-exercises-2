package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    //String getString()
    public String getString(){
        System.out.println("Please enter your favorite color.");
        String color = scanner.next();
        System.out.println(color);
        return color;
    }
    //boolean yesNo()
    //int getInt(int min, int max)
    //int getInt()
    //double getDouble(double min, double max)
    //double getDouble()
}
