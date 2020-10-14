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
    //int getInt()
    //double getDouble(double min, double max)
    //double getDouble()
}
