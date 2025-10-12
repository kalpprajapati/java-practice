import java.util.Scanner;
public class ShoppingDiscount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double price=0;
        System.out.println("======= Shopping Manu =======");
        System.out.println("1. Mobile - 15000/-");
        System.out.println("2. Leptop - 50000/-");
        System.out.println("3. HeadPhones - 5000/-");
        System.out.print("Enter your Choice: ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                price = 15000;
                break;
            case 2:
                price = 50000;
                break;
            case 3:
                price = 5000;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.print("Enter the Discount code (1 for FEST10, 2 for NONE):");
        int code=sc.nextInt();

        double discount=0;
        if(code==1){
            discount=0.10*price;//10% Discount
        }

        double finalprice= price - discount;
        System.out.println("Final Price is: "+finalprice);
    }
}