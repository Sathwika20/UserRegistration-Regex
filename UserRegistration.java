import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
  Scanner sc = new Scanner(System.in);
//UC1
 public void checkfirstName() {
   System.out.print("Enter First Name:");
   String firstName = sc.nextLine();
   boolean check = Pattern.compile("^[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
   if (check == true) {
   System.out.println("firstName is valid");
  }
  else {
      System.out.println("firstName is not valid");
  }
}
//UC2
  public void checklastName() {
   System.out.print("Enter Last Name:");
   String lastName = sc.nextLine();
   boolean check = Pattern.compile("^[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
   if (check == true) {
   System.out.println("lastName is valid");
  }
  else {
      System.out.println("lastName is not valid");
  }
}
//UC3
   public void checkemail() {
   System.out.print("Enter Email:");
   String email = sc.nextLine();
   boolean check = Pattern.compile("^abc.[a-z]{1,}.[(xyz)?=n(in)]?@bl.co.[a-z]{2,3}$").matcher(email).matches();
   if (check == true) {
   System.out.println("email is valid");
  }
  else {
      System.out.println("email is not valid");
  }
}
//UC4
     public void checkmobileNumber() {
   System.out.print("Enter Mobile Number:");
   String mobileNumber = sc.nextLine();
   boolean check = Pattern.compile("^[0-9]{1,2}[ ][0-9]{10}$").matcher(mobileNumber).matches();
   if (check == true) {
   System.out.println("mobileNumber is valid");
  }
  else {
      System.out.println("mobileNumber is not valid");
  }
}
//UC5-UC8
  public void checkpassword() {
   System.out.print("Enter password:");
   String password = sc.nextLine();
   boolean check = Pattern.compile("^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$").matcher(password).matches();
   if (check == true) {
   System.out.println("pasword is valid");
  }
  else {
      System.out.println("password is not valid");
  }
}



//main
  public static void main(String args[]) {
   UserRegistration user = new UserRegistration();
   user.checkfirstName();
   user.checklastName();
   user.checkemail();
   user.checkmobileNumber();
   user.checkpassword();
  }
}
