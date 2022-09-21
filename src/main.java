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
        
    }
}
