import java.util.regex.Pattern;
import java.util.Scanner;
class xyz {
interface xyz{
public void xyzfirstname();
public void xyzlastname();
Scanner sc = new Scanner(System.in);

  public void xyzfirstname() {
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

   public void xyzlastname()  {
 System.out.print(" Enter Last Name: ");
   String lastName = sc.nextLine();
   boolean lastname = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(lastName).matches();
   if (lastname == true) {
    System.out.println("valid user name");
   }

  else {

      System.out.println("invalid user name");
    }
  }
}

class main {
public static void main(String[] args) {
 Firstname firstname = new Firstname();
 Lastname lastname = new Lastname();
  xyz.firstname();
  xyz.lastname();
 }
}
