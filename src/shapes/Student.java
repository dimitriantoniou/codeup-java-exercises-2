package shapes;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student (String name){
        this.name=name;
        this.grades= new ArrayList<>();
    }
    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum =0;
        for(int i=0;i<grades.size();i++){
            sum +=grades.get(i);
        }
        int average = sum/grades.size();
        System.out.println(average);
        return average;
    }
    public static void main(String[] args){
        Student dimitri = new Student("Dimitri");
        dimitri.grades.add(100);
        dimitri.grades.add(80);
        dimitri.grades.add(90);
        dimitri.getGradeAverage();
    }
}
