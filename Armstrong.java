import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(num>0){
            int digit = num%10;
            sum += Math.pow(digit, digits);
            num /= 10;
        } 
        if(sum == (originalNum)){
            System.out.println("It is an Armstrong number");
        }
        else{
            System.out.println("It is not an Armstrong number");
        }
    }
}
