import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi=3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer. ");
        int userInt=scanner.nextInt();
        System.out.println("You entered: "+userInt);

        System.out.print("Please enter three words, separated by a space. ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.print("Please enter a sentence. ");
        //String sentence = scanner.next();
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        //skips the sentence input when run

        Scanner classroom = new Scanner(System.in);
        System.out.printf("How wide is Codeup\'s classroom? ");
        float classroomWidth = Float.parseFloat(classroom.nextLine());
        System.out.printf("How long is Codeup\'s classroom? ");
        float classroomLength = Float.parseFloat(classroom.nextLine());
        float area = classroomWidth * classroomLength;
        float perimeter = (classroomWidth*2)+(classroomLength*2);
        System.out.printf("Area: %f%n",area);
        System.out.printf("Perimeter: %f%n",perimeter);
    }
}
