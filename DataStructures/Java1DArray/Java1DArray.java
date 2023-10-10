import java.util.Scanner;
public class Java1DArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] a = new int[n];
        //taking user inputs.
        for(int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
        }
        input.close();
        //printing elements present into an array.
        for(int i = 0; i < a.length; i++ )
        {
            System.out.println(a[i]);
        }
    }
}