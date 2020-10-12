import java.util.Scanner;

public class MethodsExercises {

    //Basic Arithmetic
    //
    //Create four separate methods. Each will perform an arithmetic operation:
    //
    //Addition
    //Subtraction
    //Multiplication
    //Division
    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //
    //Test your methods and verify the output.
    //
    //Add a modulus method that finds the modulus of two numbers.

    public static int Addition(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    public static int Subtraction(int a, int b){
        System.out.println(a-b);
        return a-b;
    }
    public static int Multiplication(int a, int b){
        System.out.println(a*b);
        return a*b;
    }
    public static int Division (int a, int b){
        System.out.println(a/b);
        return a/b;
    }
    public static int Modulus (int a, int b){
        System.out.println(a%b);
        return a%b;
    }

    //Create a method that validates that user input is in a certain range
    //
    //The method signature should look like this:
    //
    //
    //public static int getInteger(int min, int max);
    //and is used like this:
    //
    //
    //System.out.print("Enter a number between 1 and 10: ");
    //int userInput = getInteger(1, 10);
    //If the input is invalid, prompt the user again.
    //
    //Hint: recursion might be helpful here!

    public static int getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.next());
        if (userInput<min){
            System.out.println("Sorry, that's too low. Try again!");
        }else if(userInput>max){
            System.out.println("Sorry, that's too high. Try again!");
        }System.out.println("That works!");
    }


    public static void main(String[] args){
        Addition(1,1);
        Subtraction(4,2);
        Multiplication(2,2);
        Division(10,2);
        Modulus(6,3);


    }
}
