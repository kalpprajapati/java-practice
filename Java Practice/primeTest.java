public class primeTest{
    public static void main(String[] args) {
        int i,n;
        boolean flag=true;
        n=37;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                flag= false;
                break;
            }

        }
        if(flag==true){
            System.out.println("\n Number "+n+" is a Prime Number");
        }
        else{
            System.out.println("\n Number "+n+" is not a Prime Number");
        }
    }
}