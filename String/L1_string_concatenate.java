import java.util.Scanner;

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first, middle and last name:-");
        String first_name = sc.next();
        String middle_name = sc.next();
        String last_name = sc.next();
        String full_name=first_name+" "+middle_name+" "+last_name;
        System.out.println(full_name+" is this");
        sc.close();
    }
}
