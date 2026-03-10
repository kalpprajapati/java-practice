/* # Print Fibonacci Series up to Nth term

Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

Examples
Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6
Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)*/
import java.util.Scanner;
public class Fibonacci{
    public int fibo(int n){
        if(n<=1){
            return n;
        }
        int last=fibo(n-1);
        int slast=fibo(n-2);
        return last+slast;

    }
    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index position for get the fibonacci number of that index: ");
        int n=sc.nextInt();
        System.out.println("Your "+n+" th index poition fibonacci number is : "+obj.fibo(n));

        
    }
}
/* #output:
Enter the index position for get the fibonacci number of that index: 6
Your 6 th index poition fibonacci number is : 8
*/