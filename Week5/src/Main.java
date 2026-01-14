import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Creating two ArrayList: days and temps
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temps = new ArrayList<>();

        // Adding days of the week to days
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Get user input for average temp of a day
        for (String day : days) {
            System.out.print("Enter average temperature for " + day + ": ");
            double temp = scnr.nextDouble();
            temps.add(temp);
        }
        scnr.nextLine();

        // Ask user for day or week or exit to quit loop
        while (true) {
            System.out.print("\nEnter a day of the week (Monday - Sunday), 'week' or 'exit' : ");
            String input = scnr.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            if (input.equalsIgnoreCase("week")) {
                // Display all days, temps, and weekly average
                double sum = 0.0;
                System.out.println("\nTemperatures for the week: ");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temps.get(i));
                    sum += temps.get(i);
                }
                double avg = sum / temps.size();
                System.out.printf("Weekly average: %.2f%n", avg);
            } else {
                // Display one day's temp
                String dayInput = input.toLowerCase();
                if (!dayInput.isEmpty()) {
                    dayInput = dayInput.substring(0, 1).toUpperCase() + dayInput.substring(1);
                }

                // Find the index of the entered day
                int index = days.indexOf(dayInput);

                if (index >= 0) {
                    System.out.println("Temperature for " + days.get(index) + ": " + temps.get(index) + " degrees.");
                } else {
                    System.out.println("Invalid input. Enter a valid day (Monday - Sunday), 'week', or 'exit'.");
                }
            }
        }
        scnr.close();
    }
}
