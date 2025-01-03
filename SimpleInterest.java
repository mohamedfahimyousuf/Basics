import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int p = scanner.nextInt();
        System.out.print("Enter Time: ");
        int t = scanner.nextInt();
        System.out.print("Enter Rate: ");
        int r = scanner.nextInt();
        int si = (p*r*t)/100;
        System.out.print("Simple Interest: "+ si);
    }
}
