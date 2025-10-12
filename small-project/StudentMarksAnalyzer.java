import java.util.Scanner;
public class StudentMarksAnalyzer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        int total=0;

        for(int i=0;i<marks.length;i++){
            System.out.println("Enter Marks of student "+(i+1)+" :");
            marks[i]=sc.nextInt();
            total+=marks[i];    
        }

        //calculate highest and lowest
        int highest=marks[0];
        int lowest=marks[0];

        for(int i=1;i<marks.length;i++){
            if(marks[i]>highest){
                highest=marks[i];
            }
            if(marks[i]<lowest){
                lowest=marks[i];
            }
        }

        double average=total/(double)marks.length;

        System.out.println("======== Result ========");
        System.out.println("Total Marks:"+total);
        System.out.println("Average Marks:"+average);
        System.out.println("Highest Marks:"+highest);
        System.out.println("Lowest Marks:"+lowest);

        if(average>=50){
            System.out.println("Overall Result: PASS");
        }else{
            System.out.println("Overall Result: FAIL");
        }
    }
}