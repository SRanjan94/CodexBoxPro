package arrayprogramming;

public class MultiDimensional {
    public static void main(String [] args){
        int a[][]={{1,2,3},{11,22,33},{5,6,7}};
        for (int i=0;i<3; i++){
            for (int j=0; j<3; j++)
                System.out.println(a[i][j]+"");
            System.out.println();

        }
    }
}
