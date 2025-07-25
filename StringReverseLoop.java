public class StringReverseLoop {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Appending in reverse order
        }

        System.out.println("Reversed: " + reversed);
    }
}
