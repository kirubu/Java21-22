import java.util.Scanner;
class JaggedArray
{
    public static void main(String[] args) 
    {
        //ir-regular multi-dimension array
        //define only row dimension
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = new int[sc.nextInt()];//new int[4]
        }
        /* arr[0] = new int[10];
        arr[1] = new int[3];
        arr[2] = new int[15]; */

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}