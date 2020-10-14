package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    //String getString()
    public String getString(){
        return scanner.nextLine();
    }
    //boolean yesNo()
    public boolean yesNo(){
        if(scanner.next().toLowerCase().contains("y")){
            return true;
        }return false;
    }
    //int getInt(int min, int max)
    public int getInt(int min, int max){
        int number = scanner.nextInt();
        if(number<min||number>max){
            System.out.println("Please try again.");
            number=scanner.nextInt();
        }return number;
    }
    //int getInt()
    public int getINt(){
        return scanner.nextInt();
    }
    //double getDouble(double min, double max)
    public double getDouble(double min, double max){
        double number = scanner.nextDouble();
        if(number<min||number>max){
            System.out.println("Please try again.");
            number=scanner.nextInt();
        }return number;
    }
    //double getDouble()
    public double getDouble(){
        return scanner.nextDouble();
    }
}
