import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the total bill?");
        double totalBill = s.nextDouble();
        System.out.println("What is the tip percentage in whole numbers?");
        int tipPercentage = s.nextInt();
        System.out.println("How many people are splitting the bill?");
        int numberOfPeople = s.nextInt();
        double totalTip = ((double)((int)(totalBill*tipPercentage+0.5)))/100;//calculates the tip and rounds it normally
        System.out.println(totalTip);
        double billAndTip = totalBill + totalTip;
        double tipPerPerson = ((double)((int)((totalTip/numberOfPeople+0.005)*100)))/100;//calculates the tip per person and rounds
        double totalPerPerson = ((double)((int)((billAndTip/numberOfPeople+0.005)*100)))/100;//calculates total per person and rounds

    }
}
