import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class JavaArrayList 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
        int n = input.nextInt();

        for(int i = 0; i < n; i++)
        {
            int m = input.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j < m; j++)
            {
                list.add(input.nextInt());
            }
            listOfList.add(list);
        }
        int q = input.nextInt();
        for(int k = 0; k < q; k++)
        {
            int r = input.nextInt();
            int c = input.nextInt();
            try
            {
                int v = listOfList.get(r-1).get(c-1);
                System.out.println(v);
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
        input.close();
    }
}
