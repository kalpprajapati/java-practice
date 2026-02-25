public class PrintName{

    // Recursive function to p rint Name N times
    public void print(String name,int i,int n){
        //Base case: if count equals N, stop Recursion
        if(i>n){
            return;
        }
        System.out.println(name);
        print(name,i+1,n);

    }
    public static void main(String[] args) {
        PrintName obj=new PrintName();
        int n=5;
        String name="Ashish";
        obj.print(name,1,n);
    }
}