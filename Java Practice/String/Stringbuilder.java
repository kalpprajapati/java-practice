public class Stringbuilder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kalp Prajapati");

        System.out.println("Name : "+sb);

        //char at index 0
        System.out.println("character at index 0 is : "+sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'t');
        System.out.println("After using setCharAt method : "+sb);

        // insert
        sb.insert(0,'A');
        System.out.println("After using insert method : "+sb);

        //delete
        sb.delete(2, 3);
        System.out.println("After using delete method : "+sb);

        //Append
        StringBuilder s=new StringBuilder("h");
        s.append("e");
        s.append("l");
        s.append("l");
        s.append("o");
        System.out.println("After appending character in variable s : "+s);
        System.out.println("length is : "+s.length());
        
    }
}
/*
//#output:
Name : Kalp Prajapati
character at index 0 is : K
After using setCharAt method : talp Prajapati
After using insert method : Atalp Prajapati
After using delete method : Atlp Prajapati
After appending character in variable s : hello
length is : 5 */

