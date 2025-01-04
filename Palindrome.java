import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        if(input.equals(reversed)){
            System.out.println("The given String is Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
        scanner.close();
    }
}
