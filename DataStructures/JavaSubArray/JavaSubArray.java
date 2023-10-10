import java.util.Scanner;
public class JavaSubArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            int sum = a[i];
            if(sum < 0)
            {
                count++;
            }
            for(int j = i+1; j < n && i+1 < n; j++)
            {
                sum = sum + a[j];
                if(sum < 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
        input.close();
    }
}