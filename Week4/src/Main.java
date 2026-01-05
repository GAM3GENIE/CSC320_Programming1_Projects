import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        List<Float> grades = new ArrayList<>();

        // read input from user
        for (int i = 0; i < 10; i++){
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades.add(scnr.nextFloat());
        }

        float sum = 0;
        float min = grades.get(0);
        float max = grades.get(0);

        // read list and calculate sum, min, max values
        for(float grade : grades){
            sum += grade;
            if(grade < min) min = grade;
            if(grade > max) max = grade;
        }
        
        // calculate average
        float avg = sum / grades.size();

        System.out.println("Your Average grade is: " + avg);
        System.out.println("Your Maximum grade is: " + max);
        System.out.println("Your Minimum grade is: " + min);
        scnr.close();
    }
}
