import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class UserRegestration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.println("Enter Fist Name:");
   FirstName = sc . nextLine();
  boolean check = pattern.compile("[A-Z]{1}[a-z]{2,}");
  if (!check) {
    System.out.print("Invalid First Name");
    checkFirstName();
   }
  else
    System.out.print("First Name is Valid");
 }
}
