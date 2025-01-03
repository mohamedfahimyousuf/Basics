import java.util.*;
public class InrToUsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The exchange rate is 1 USD = 83 INR");
        int usd = 83;
        System.out.print("Enter the INR amount: ");
        int inr = scanner.nextInt();
        double con = inr/usd;
        System.out.printf("USD : %.2f $",con); 
    }
}
