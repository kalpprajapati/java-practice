import java.util.Scanner;
public class PrintNto1{
    public void print(int n,int i){
        if(n<i){
            return;
        }
        System.out.println(n);
        print(n-1,i);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintNto1 obj=new PrintNto1();
        System.out.print("Enter your number : ");
        int n=sc.nextInt();
        obj.print(n,1);
    }
}