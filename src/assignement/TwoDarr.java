package assignement;

public class TwoDarr {
    public static void main(String[] args){
        int[][] arr={{19,26,23},{11,12,13},{21,22,23}};
        for(int i=0; i<arr.length; i++)
        {

            for(int j=0; j<arr[i].length; j++)
            {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
