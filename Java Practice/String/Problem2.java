/* Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ 
in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz” */

import java.util.*;

public class Problem2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Original String : ");
        String org=sc.nextLine();
        String result="";

        for(int i=0;i<org.length();i++){
            if(org.charAt(i)=='e'){
                result+='i';
            }else{
                result+=org.charAt(i);
            }
        }
        System.out.println("Result :"+result);

    }
}