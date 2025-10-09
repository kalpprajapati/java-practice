public class Array1{
    public static void main(String[] args) {
        int x=1,i;
        int[] a=new int[5];
        for(i=0;i<5;i++){
            a[i]=x;
            x++;

        }
        System.out.println("Array elements are:");
        for(i=0;i<5;i++){
            System.out.println(" "+a[i]);
        }

    }   
}