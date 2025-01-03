import java.util.*;
public class Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter operation: ");
        String opr = scanner.nextLine();
        int val = 0;
        if(opr.equals("+")){
            val = num1 + num2;
        }
        else if(opr.equals("-")){
            val = num1-num2;
        }
        else if(opr.equals("*")){
            val = num1 * num2;
        }
        else if(opr.equals("/")){
            if(num2!= 0){
                val = num1/num2;
            }
            else{
                System.out.println("Zero division error");
                return;
            }
        }
        else{
            System.out.println("Invalid Operator!");
            return;
        }
        System.out.println("The value is "+ val);
    }
    
}
