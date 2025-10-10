public class twodarray{
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        int i,j,x=1;
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                a[i][j]=x;
                x++;
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}