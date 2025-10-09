import java.util.Scanner;
public class ArrayTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int[] a=new int[5];
        for(i=0;i<5;i++){
            System.out.println("Enter value:");
            a[i]=sc.nextInt();
        }        
        System.out.println("\n Array elemnts are:");
        for(i=0;i<5;i++){
            System.out.println(" "+a[i]);
        }

    }
}