/* # Check if the given String is Palindrome or not

Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

Examples
Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.*/
import java.util.Scanner;

public class Palindrome{
    public boolean palindrome(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return palindrome(i+1, s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Palindrome obj=new Palindrome();
        System.out.print("Enter the name : ");
        String s=sc.next();
        System.out.println("Given Name "+s+" is Palindrome ? ->"+obj.palindrome(0, s));
        
    }
}
/* #output:
Enter the name : madam
Given Name madam is Palindrome ? ->true
*/