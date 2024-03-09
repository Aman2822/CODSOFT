import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Student_grade_calculator{
    
    private static String getGrade(int marks){
        if(marks>=0 && marks<40){
            return "F";
        } else if(marks>=40 && marks<50){
            return "E";
        }else if(marks>=50 && marks<60){
            return "D";
        }else if(marks>=60 && marks<70){
            return "C";
        }else if(marks>=70 && marks<80){
            return "B";
        }else if(marks>=80 && marks<90){
            return "A";
        }else{
            return "S";
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Map<Integer , String> gradeMap = new HashMap<>();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int totalMarks = 0;
        for(int i = 1; i<= numStudents ; i++){
            System.out.print("Enter the marks of students : ");
            int marks = scanner.nextInt();

            String grade = getGrade(marks);
            gradeMap.put(marks, grade);

            totalMarks += marks;
        }
         double averageMarks = (double)  totalMarks / numStudents ;
         System.out.printf("The average marks of the studensts is : %.2f%n" , averageMarks);

         System.out.println("The grades of the students are : ");
         for(Integer marks : gradeMap.keySet()){
            System.out.println(marks + " : " + gradeMap.get(marks));
         }
    }
}