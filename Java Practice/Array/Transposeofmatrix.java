public class Transposeofmatrix{
    public static void main(String[] args) {
        int b[][]=new int[3][3];
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Before The Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("  "+a[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=a[i][j];
            }

        }
        System.out.println("After The Transpose of Matrices is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("  "+b[i][j]);
            }
            System.out.println();
        }
    }
}