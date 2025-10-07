public class NumericPalindrome{
    public static void main(String[] args) {
        int r,rev,n,x;
        n=12321;
        x=n;
        rev=0;

        while(n!=0){
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        System.out.println("Reverse Number:"+rev);
        if(rev==x){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }
    }
}