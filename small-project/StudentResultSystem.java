import java.util.Scanner;
public class StudentResultSystem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] names={"Kalp", "Rajvi", "manan", "megha", "Uday"};
        int[] marks={70,80,50,60,40};
        int choice;
        do { 
            System.out.println("===== Student Result Menu =====");
            System.out.println("1. Display all Student Result");
            System.out.println("2. Search student by Name");
            System.out.println("3. Show topper");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("\nName\tMarks\tResult");
                    for(int i=0;i<names.length;i++){
                        String result=(marks[i] >=40)? "Pass" : "fail";
                        System.out.println(names[i]+"\t"+marks[i]+"\t"+result);
                    }
                    break;
                case 2:
                    System.out.println("Enter name to Search:");
                    String search=sc.nextLine();
                    boolean found=false;
                    for(int i=0;i<names.length;i++){
                        if(names[i].equalsIgnoreCase(search)){
                            System.out.println(names[i]+" scored "+marks[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found)  System.out.println("Search Not found!!");
                    break;
                case 3:
                    int max=marks[0];
                    String topper=names[0];
                    for(int i=1;i<marks.length;i++){
                        if(marks[i]>max){
                            max=marks[i];
                            topper=names[i];
                        }
                    }
                    System.out.println("Topper "+topper+" with "+max+" Marks.");
                    break;
                    
                case 4:
                    System.out.println("Exiting System");
                    break;

                
                default:
                    System.out.println("Invalid choice!! try Again");

            }

        } while (choice!=4);

    }
}