import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> L = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) 
        {
            L.add(input.nextInt());
        }
        int Q = input.nextInt();
        for (int i = 0; i < Q; i++) 
        {
            String op = input.next();
            if (op.equalsIgnoreCase("INSERT")) 
            {
                int index = input.nextInt();
                int item = input.nextInt();
                L.add(index, item);
            } 
            else 
            {
                L.remove(input.nextInt());
            }
        }
        for (Integer integer : L) 
        {
            System.out.print(integer + " ");
        }
        input.close();
    }
}