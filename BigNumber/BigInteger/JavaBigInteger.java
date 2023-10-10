import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class JavaBigInteger 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        BigInteger a = new BigInteger(input.next());
        System.out.print("Enter the second number: ");
        BigInteger b = new BigInteger(input.next());
        input.close();
        
        System.out.println("Addition: "+a.add(b));
        System.out.println("Multiplication: "+a.multiply(b));
        
    }
}