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

    public static void main(String[] args){
        Addition(1,1);
        Subtraction(4,2);
        Multiplication(2,2);
        Division(10,2);
        Modulus(6,3);
    }
}
