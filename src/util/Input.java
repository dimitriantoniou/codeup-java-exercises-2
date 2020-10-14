package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);
    //String getString()
    public static String getString(){
        return scanner.nextLine();
    }
    //boolean yesNo()
    public static boolean yesNo(){
        if(scanner.next().toLowerCase().contains("y")){
            return true;
        }return false;
    }
    //int getInt(int min, int max)
    public static int getInt(int min, int max){
        int number = scanner.nextInt();
        if(number<min||number>max){
            System.out.println("Please try again.");
            number=scanner.nextInt();
        }return number;
    }
    //int getInt()
    public static int getINt(){
        return scanner.nextInt();
    }
    //double getDouble(double min, double max)
    public static double getDouble(double min, double max){
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
