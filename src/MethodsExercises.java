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
            getInteger(min,max);
        }else if(userInput>max){
            System.out.println("Sorry, that's too high. Try again!");
            getInteger(min,max);
        }else{
            System.out.println("That works!");
            //System.out.prtinln("Would you like to play again? y/n")''
        }
        return userInput;
    }

    //Calculate the factorial of a number.
    //
    //Prompt the user to enter an integer from 1 to 10.
    //Display the factorial of the number entered by the user.
    //Ask if the user wants to continue.
    //Use a for loop to calculate the factorial.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //Use the long type to store the factorial.
    //Continue only if the user agrees to.
    //A factorial is a number multiplied by each of the numbers before it.
    //Factorials are denoted by the exclamation point (n!). Ex:

    public static void Factorial(int n) {
        Scanner factorial = new Scanner(System.in);
        System.out.println("Would you like to find a factorial? y/n");
        String userContinue = factorial.next();
        while (userContinue.equalsIgnoreCase("y")) {
            System.out.println("Please enter an integer between 1 and 10.");
            int userInt = Integer.parseInt(factorial.next());
            int product = 1;
            for (int i = 1; i <= userInt; i++) {
                product *= i;
            }
            System.out.print(product);
            System.out.println("Would you like to find a factorial? y/n");
            userContinue=factorial.next();
        }System.out.println("Thanks for palying!");
    }

    public static void main(String[] args){
        Addition(1,1);
        Subtraction(4,2);
        Multiplication(2,2);
        Division(10,2);
        Modulus(6,3);

        getInteger(1,10);
        Factorial(3);
    }
}
