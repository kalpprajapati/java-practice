import java.util.Scanner;
public class EvenOddCounter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[6];

        for(int i=0;i<numbers.length;i++){
            System.out.print("Enter Number "+(i+1)+" :");
            numbers[i]=sc.nextInt();

        }
        int evencount=0, oddcount=0;
        int i=0;

        while(i<numbers.length){
            if(numbers[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
            i++;
        }
        System.out.println("======== Result ========");
        System.out.println("Even Number:"+evencount);
        System.out.println("Odd Numbers:"+oddcount);
    }
}