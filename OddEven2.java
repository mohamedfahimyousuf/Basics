//To find the given number is odd or even by getting the input from the user

//Using If Else 

import java.util.*;

public class OddEven2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("The given no is EVEN");
        }
        else{
            System.out.println("The given no is ODD");
        }
        sc.close();
    }
}