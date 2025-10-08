public class factorialtest{
    public static void main(String[] args) {
        int i,n;
        n=5;
        int f=1;
        for(i=n;i>=1;i--){
            f=f*i;
        }
        System.out.println("\n The Factorial of "+n+" is="+f);
    }
}