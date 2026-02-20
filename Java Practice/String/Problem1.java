/* Take an array of Strings input from the user & find the cumulative (combined) length of all those strings. */
import java.util.*;

public class Problem1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give size of the Array : ");
        int size=sc.nextInt();
        String[] arr= new String[size];
        int totlength=0;

        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+" th index value of an Array");
            arr[i]=sc.next();
            totlength+=arr[i].length();

        }
        System.out.println("Combine length of those Strings from the array is :"+totlength);
        
    }
}

/* 
// #output:
give size of the Array : 
3
Enter 0 th index value of an Array
Hello
Enter 1 th index value of an Array
Tony
Enter 2 th index value of an Array
Stark
Combine length of those Strings from 1the array is :14*/