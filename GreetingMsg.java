import java.util.*;
public class GreetingMsg{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome "+name);
        scanner.close();
    }
}
