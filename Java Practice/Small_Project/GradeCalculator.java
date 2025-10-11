import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int subject;
        System.out.println("Enter the number of Subject:");
        subject=sc.nextInt();

        int total=0;
        for(int i=0;i<subject;i++){
            System.out.println("Enter the marks of subject:");
            int marks=sc.nextInt();

            total+=marks;
        }
        double avg=total/(double)subject;
        System.out.println("Average marks:"+avg);

        if(avg>=90){
            System.out.println("Grade:A");
        }else if(avg>=80){
            System.out.println("Grade:B");
        }else if(avg>=70){
            System.out.println("Grade:C");
        }else if(avg>=60){
            System.out.println("Grad:D");
        }else{
            System.out.println("very good you Fail");
        }

    }
}