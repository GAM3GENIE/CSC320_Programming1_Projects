import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double couponPercent;
        double weekOne;
        double weekTwo;
        double weekThree;
        double weekFour;
        double monthlyTotal;
        double weeklyAvg;
        double weeklyAvgDiscount;
        double monthlyDiscount;

        // Validate input
        System.out.print("Please enter your coupon amount in decimal format. (Example, .10 for 10%): ");
        while(!scnr.hasNextDouble()){
            System.out.print("Please enter a valid number: ");
            scnr.next();
        }
        couponPercent = scnr.nextDouble();
        // If value <= 0 OR > 1, force to 10% and stop asking
        if (couponPercent <= 0.0 || couponPercent > 1.0) {
            couponPercent = 0.10;
            System.out.println("Value out of range. Special coupon applied: 10% off!");
        }

        // Get and validate user input for grocery weeks 1 - 4
        System.out.print("Please enter your week 1 grocery bill: ");
        while(!scnr.hasNextDouble()){
            System.out.print("Please enter a valid number: ");
            scnr.next();
        }
        weekOne = scnr.nextDouble();
        System.out.print("Please enter your week 2 grocery bill: ");
        while(!scnr.hasNextDouble()){
            System.out.print("Please enter a valid number: ");
            scnr.next();
        }
        weekTwo = scnr.nextDouble();
        System.out.print("Please enter your week 3 grocery bill: ");
        while(!scnr.hasNextDouble()){
            System.out.print("Please enter a valid number: ");
            scnr.next();
        }
        weekThree = scnr.nextDouble();
        System.out.print("Please enter your week 4 grocery bill: ");
        while(!scnr.hasNextDouble()){
            System.out.print("Please enter a valid number: ");
            scnr.next();
        }
        weekFour = scnr.nextDouble();

        // Calculate values
        monthlyTotal = weekOne + weekTwo + weekThree + weekFour;
        weeklyAvg = monthlyTotal / 4;
        weeklyAvgDiscount = weeklyAvg * couponPercent;
        monthlyDiscount = monthlyTotal * couponPercent;

        // Display coupon percentage and totals without coupon
        System.out.printf("%nCoupon Amount: %.0f%% off%n", couponPercent * 100);
        System.out.printf("%n-No Coupon-%nMonthly total grocery bill: $%.2f%n%nWeekly Average grocery bill: $%.2f%n" ,monthlyTotal ,weeklyAvg);

        // total amount with coupon subtracted
        weeklyAvg = weeklyAvg - weeklyAvgDiscount;
        monthlyTotal = monthlyTotal - monthlyDiscount;
        System.out.printf("%n-Coupon Applied-%nMonthly total grocery bill: $%.2f%n%nWeekly Average grocery bill: $%.2f%n" ,monthlyTotal ,weeklyAvg);
        scnr.close();
    }
}