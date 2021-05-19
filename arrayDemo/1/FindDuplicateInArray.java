import java.util.Scanner;
import java.util.Arrays;
class FindDuplicateInArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Array:-> After Sorting:->");
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+", ");
        System.out.println("\nDuplicate Elements in array");
        for(int i=0;i<n;)
        {
            int temp = arr[i];
            int count = 0;
            while(i<n && temp==arr[i])
            {
                count++;
                i++;
            }
            if(count>1)
                System.out.println(temp);
        }
    }
}