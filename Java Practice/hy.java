import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your:");
        String email=sc.nextLine();
        if(email.contains("@") && email.contains(".com")){
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}