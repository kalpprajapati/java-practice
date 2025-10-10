public class TransSame{
    public static void main(String[] args){
        int temp;
        int value=1;
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=value++;
            }
        }
        System.out.println("The actual of matrices is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();

        }  
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i<=j){
                    temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }  
        System.out.println("The Transpose of matrices is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}