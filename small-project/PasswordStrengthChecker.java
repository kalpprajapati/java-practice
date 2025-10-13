import java.util.Scanner;
public class PasswordStrengthChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Password:");
        String password=sc.nextLine();

        int length=password.length();
        boolean hasupper=false, haslower=false, hasdigit=false, hasspecial=false;

        for(int i=0;i<length;i++){
            char ch=password.charAt(i);
            if(Character.isUpperCase(ch)) hasupper=true;
            else if(Character.isLowerCase(ch)) haslower=true;
            else if(Character.isDigit(ch)) hasdigit=true;
            else hasspecial=true;
        }

        if(length>=8 && hasupper && haslower && hasdigit && hasdigit)
            System.out.println("Strong PassWord");
        else if(length>=6 && haslower &&hasdigit )
            System.out.println("Medium Password");
        else 
            System.out.println("Weak Password (Use Upper, Lower, Digits & Special chars)");
    }
}