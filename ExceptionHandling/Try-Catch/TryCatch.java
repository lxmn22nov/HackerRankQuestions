//Exception handling (try-catch).
import java.io.*;
import java.util.*;

public class TryCatch 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        try 
        {
            System.out.print("Enter the value of x: ");
            int x = input.nextInt();
            System.out.print("Enter the value of y: ");
            int y = input.nextInt();

            int z = x / y;
            System.out.println("Value of z: "+z);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println(e);
        } 
        catch (InputMismatchException e) 
        {
            System.out.println(e.getClass().getName());
        } 
        finally 
        {
            input.close();
        }
    }
}