public class LowestAge{
    public static void main(String[] args) {

        int ages[]={20,50,34,10,23,45,45};
        int length=ages.length;

        int lowestage=ages[0];

        for(int age:ages ){
             if(lowestage>age){
                lowestage=age;
             }   
        } 
       
        System.out.println("The Lowest Age int the Array is:"+lowestage);
    }
}