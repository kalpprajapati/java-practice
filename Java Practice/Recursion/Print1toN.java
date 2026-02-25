import java.util.Scanner;
public class Print1toN{
    public void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1,n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Print1toN obj=new Print1toN();
        System.out.print("Enter your number : ");
        int n=sc.nextInt();
        obj.print(1,n);
    }
}