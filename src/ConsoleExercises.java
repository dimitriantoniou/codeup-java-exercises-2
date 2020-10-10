import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi=3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer. ");
        int userInt=scanner.nextInt();
        System.out.print("You entered: "+userInt);
    }
}
