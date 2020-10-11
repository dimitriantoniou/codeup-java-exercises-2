import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args){
        //Loop Basics
        //
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15

        int i=5;
        while (i<=15){
            System.out.print(i+" ");
            i++;
        }

        //Do While
        //
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int a=0;
        do{
            System.out.println(a);
            a+=2;
        }while(a<=100);
        for(int y=0;y<+100;y+=2){
            System.out.println(y);
        }
        //Alter your loop to count backwards by 5's from 100 to -10.
        int b=100;
        do{
            System.out.println(b);
            b-=2;
        }while(b>=0);
        for(int z=100;z>=0;z-=2){
            System.out.println(z);
        }
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        int x=2;
        do{
            System.out.println(x);
            x= (int) Math.pow(x,2);
        }while(x<1000000);
        for (int j=2;j<=100000;j=(int)Math.pow(j,2)){
            System.out.println(j);
        }
//Fizzbuzz
//
//One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//Write a program that prints the numbers from 1 to 100.
//For multiples of three: print “Fizz” instead of the number.
//For the multiples of five: print “Buzz”.
//For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int f=1;f<=100;f++){
            if(f%3==0 && f%5==0){
                System.out.println("FizzBuzz");
            }else if(f%3==0){
                System.out.println("Fizz");
            }else if(f%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(f);
            }
        }
    //Display a table of powers.
        //
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        Scanner sc = new Scanner (System.in);
        System.out.println("Would you like to play a game? Y/N");
        String userInput=sc.next();
        while (userInput.equalsIgnoreCase("y")){
            System.out.println("Please enter an integer.");
            int userInt=sc.nextInt();
            System.out.println("You entered: "+userInt+". Here is your table of powers:");
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");
            for(int w =1;w<=userInt;w++){
                System.out.println(w+"     | "+Math.pow(w,2)+"     | "+Math.pow(w,3)+"    ");
            }
            System.out.println("Would you like to play again? Y/N");
            userInput=sc.next();
        }System.out.println("Thanks for playing!");
    }
}
