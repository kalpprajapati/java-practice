import java.util.Scanner;
public class BankInterestCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=10000;
        int choice;
    

        do { 
            System.out.println("===== Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice:");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Deposit Amount:");
                    double dep=sc.nextDouble();
                    balance+=dep;
                    System.out.println("Your Current Balance is:"+balance);
                    break;

                case 2:
                    System.out.print("Enter your Withdraw Amount:");
                    double wd=sc.nextDouble();
                    if(wd<=balance){
                        balance-=wd;
                        System.out.println("withdraw Successfully!! your current amount is:"+balance);
                    }else{
                        System.out.println("Insufficent Balance");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter account Type: (1.Saving , 2.Fix): ");
                    int type=sc.nextInt();
                    double rate;
                    if(type==1){
                        rate=3.5;
                    }else if(type==2){
                        rate=6.5;
                    }else{
                        System.out.println("Invalid Account type");
                        break;
                    }
                    System.out.println("Enter time in years:");
                    int years=sc.nextInt();
                    double interest=(balance*rate*years)/100;
                    System.out.println("Interest After "+years+ " years: "+interest);
                    break;


                case 4:
                    System.out.println("Exit System");
                    break;
                default:
                    System.out.println("invalid Choice!! Please Try Again");
                    break;
            }
        } while (choice!=4);
    }
    
    
}