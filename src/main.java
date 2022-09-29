import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");//formats to always print out 2 decimal places and an ones place
        Scanner s = new Scanner(System.in);
        System.out.println("What is the total bill?");
        double totalBill = s.nextDouble();
        System.out.println("What is the tip percentage in whole numbers?");
        int tipPercentage = s.nextInt();
        System.out.println("How many people are splitting the bill?");
        int numberOfPeople = s.nextInt();
        double totalTip = ((double)((int)(totalBill*tipPercentage+0.5)))/100;//calculates the tip and rounds it normally
        double billAndTip = ((double)((int)((totalTip+totalBill)*100)))/100;//calculates the total bill and tip and rounds
        double tipPerPerson = ((double)((int)((totalTip/numberOfPeople+0.005)*100)))/100;//calculates the tip per person and rounds
        double totalPerPerson = ((double)((int)((billAndTip/numberOfPeople+0.005)*100)))/100;//calculates total per person and rounds

        System.out.println("____________________________________________");//prints out the results
        System.out.println("Your total tip amount is " + df.format(totalTip));
        System.out.println("Your bill including tip is " + df.format(billAndTip));
        System.out.println("Your tip paid per person is " + df.format(tipPerPerson));
        System.out.println("Your total amount paid per person is " + df.format(totalPerPerson));
        System.out.println("____________________________________________");
    }
}