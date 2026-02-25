public class RecursionEx {
    int count=0; 
    void printOne() {
       
        if(count==4){
            return;
        }
        System.out.println(count);
        count++;
            
        printOne();   // recursive call
    }

    public static void main(String[] args) {
        RecursionEx obj = new RecursionEx();  // create object
        obj.printOne();     
    }
} 