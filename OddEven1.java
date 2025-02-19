//To find the given number is odd or even by getting the input from the user

//Using Ternary Operator


import java.util.*;

public class OddEven1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n= sc.nextInt();
        System.out.println(n%2==0? "The given no is EVEN":"The given no is ODD");
        sc.close();
    }
}
