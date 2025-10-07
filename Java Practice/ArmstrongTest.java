public class ArmstrongTest{
    public static void main(String[] args) {
        int r,n,x,sum;
        n=371;
        x=n;
        sum=0;
        while(n!=0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==x){
            System.out.println("number "+x+" is a Armstrong Number");
        }else{
            System.out.println("Number "+x+" is not a Armstrong Number");
        }
    }
}