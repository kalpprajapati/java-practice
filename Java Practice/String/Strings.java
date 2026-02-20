import java.util.*;
public class Strings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //next() = word
        //nextLine()=sentences
        System.out.println("Enter your first name :");
        String firstname=sc.nextLine();
        System.out.println("Enter your second name :");
        String secondname=sc.nextLine();

        //concatenation
        String fullname=firstname + " " + secondname;
        System.out.println("Name : "+fullname);

        //length of string 
        System.out.println("Length of the string is :"+fullname.length());

        //access character of a String
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        //Compare to Strings
        String name1="Tony";
        String name2="Tony";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("not equal");
        }

        /* compareTo function check 3 Testcase
            1. s1 > s2 ; +ve value
            2. s1 == s2 ; 0
            3. s1 < s2 ; -ve value

            // hello wello ; wello is greater
            // hello cello ; hello is greater
            // aahello aabello ; 1 is greater
        */
        if(name1.equals(name2)){
            System.out.println("They are the same strings");
        }else{
            System.out.println("They are diffrent Strings");
        }

        //Do not use == to check for String equality
        //gives correct answer here
        if(name1==name2){
            System.out.println("They are the same Strings");
        }else{
            System.out.println("They are diffrent Strings");
        }

        //gives incorrect answer here
        if(new String("tony") == new String("tony")){
             System.out.println("They are the same Strings");
        }else{
            System.out.println("They are diffrent Strings");
        }

        //substring 
        String sentence = "My name is Kalp";
        String name = sentence.substring(11,sentence.length());
        
        System.out.println(name);

        System.out.println(sentence.substring(0,4));

        //parseInt (String to int)

        String str="123";
        int number=Integer.parseInt(str);

        System.out.println("Number in String :"+str);
        System.out.println("Number after using parseInt :"+number);

        //toString (int to String)

        int num = 123;
        str = Integer.toString(num);
        System.out.println("Number in Interger :"+num);
        System.out.println("Number after using toString : " + str + " and its length become :" + str.length());


    }
}
//#Output :
/* 
Enter your first name :
Kalp
Enter your second name :
Prajapati
Name : Kalp Prajapati
Length of the string is :14
K
a
l
p

P
r
a
j
a
p
a
t
i
Strings are equal
They are the same strings
They are the same Strings
They are diffrent Strings
Kalp
My n
Number in String :123
Number after using parseInt :123
Number in Interger :123
Number after using toString :123and its length become :3
*/