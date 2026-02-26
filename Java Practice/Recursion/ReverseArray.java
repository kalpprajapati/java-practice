
import java.util.Scanner;

public class ReverseArray{
    int i=0;
    /*// another way to reverse and array
    static void reverse(int arr[], int start, int end) {

        // Base condition
        if (start >= end) {
            return;
        }

        // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverse(arr, start + 1, end - 1);
    }*/
    public void reverse(int[] arr){
        if(this.i>=arr.length/2){
            return;
        }   

        int temp=arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=temp;

        i++;
        reverse(arr);

    }
    public static void main(String[] args) {
        ReverseArray obj=new ReverseArray();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        
        obj.reverse(arr);

        System.out.println("Reverse array: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
/* #output :
Enter size: 5
Enter elements: 1 2 3 4 5 
Reverse array: 
5 4 3 2 1
*/