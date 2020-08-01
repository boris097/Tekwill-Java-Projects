import java.util.Scanner;
public class Main {
    public static String prepareFullName (String firstName, String lastName){
        String result = "";
        if (firstName != null) {
            result += firstName;
            if (lastName != null) {
                result += " ";
            }
        }
        if (lastName != null) {
            result += lastName;
        }
        return result;
    }
    /* Do not change code below */
    public static void main (String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        firstName = "null" .equals(firstName) ? null : firstName;
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        lastName = "null" .equals(lastName) ? null : lastName;
        System.out.println(prepareFullName(firstName, lastName));
    }
}