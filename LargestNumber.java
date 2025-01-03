import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println("num 1 is greater than num 2");
        }
        else if(num1<num2){
            System.out.println("num 2 is greater than num 1");
        }
        else if(num1==num2){
            System.out.println("Both are equal");
        }
    }
}
