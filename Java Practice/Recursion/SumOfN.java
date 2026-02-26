/* # Sum of first N Natural Numbers

Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .

Examples
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15

Input: N=6
Output: 21
Explanation: 1+2+3+4+5+6=15*/
import java.util.Scanner;
public class SumOfN{
    public int sumofNnumbers(int n){
        if(n==0){
            return 0;
        }
        return n+sumofNnumbers(n-1);
        //You also use math formula instead of this all formula : return (N * (N + 1)) / 2;
    }
    public static void main(String[] args) {
        SumOfN obj=new SumOfN();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Sum of the "+n+" number is : "+obj.sumofNnumbers(n));
    }
}
/* #Output :
Enter Number: 10
Sum of the 10 number is : 55
*/