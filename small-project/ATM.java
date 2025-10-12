import java.util.Scanner;
public class ATM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=5000;
        int choice;

        do{
           System.out.println("\n==== ATM Menu ====");
           System.out.println("1.Check Balance");
           System.out.println("2.Deposit");
           System.out.println("3.Withdraw");
           System.out.println("4.Exit");
           System.out.println("Enter you choice:");
           choice=sc.nextInt();

           switch(choice){
                case 1:
                    System.out.println("Your current balance is:"+balance);
                    break;
                case 2:
                    System.out.println("Enter Amount :");
                    double deposit=sc.nextDouble();
                    balance+=deposit;
                    System.out.println("Amount deposit Successfully");
                    break;
                case 3:
                    System.out.println("Enter Withdraw amount:");
                    double Withdraw=sc.nextDouble();
                    if(Withdraw<=balance){
                        balance-=Withdraw;
                        System.out.println("You amount withdraw successfully");

                    }else{
                        System.out.println("Insufficant balance!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you !visit again");
                    break;
                default:
                    System.out.println("invalid choice! try again");
           } 
        }while(choice!=4);
    }
}