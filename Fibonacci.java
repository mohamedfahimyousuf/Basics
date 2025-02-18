import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series upto"+ n + " terms");
        for(int i =1;i<=n;i++){
            System.out.print(a + " ");
            int next = a+b;
            a= b;
            b= next;
        }
    }
}
