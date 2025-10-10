public class matrixAddition{
    public static void main(String[] args) {
       
        int c[][]=new int [3][3];
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{9,8,7},{6,5,4},{3,2,1}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The sum of  matrices is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+c[i][j]);
            }  
            System.out.println();
        }
    }
}