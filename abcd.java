import java.util.regex.Pattern;
import java.util.Scanner;
class abcd {
public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   System.out.print(" Enter First Name: ");
   String firstName = sc.nextLine();
   boolean firstname = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(firstName).matches();
   if (firstname == true) {
    System.out.println("valid user name");
   }

  else {

      System.out.println("invalid user name");
    }
  }
}
     //UC2

 static void lastname;

  String lastName = sc.nextLine();
  boolean lastname = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(lastName).matches();
  if (lastname == true) {
  System.out.println("valid last name")
  }

  else {
      System.out.println("invalid user name");

  }
}

