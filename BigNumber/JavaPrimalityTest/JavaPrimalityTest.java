import java.util.*;
import java.io.*;
public class JavaPrimalityTest
{
    public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        input.close();
    }
}

