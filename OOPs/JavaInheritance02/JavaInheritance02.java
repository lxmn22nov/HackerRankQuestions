import java.io.*;
import java.util.*;

class Arithmetic
{
    int add(int a, int b)
    {
        return a + b;
    }
}
class Adder extends Arithmetic
{
    //class is empty.
}
public class JavaInheritance02 
{
    public static void main(String[] args) 
    {
        Adder a = new Adder();
        System.out.println("My superclass is: "+a.getClass().getSuperclass().getName());
        System.out.println(a.add(22,20)+" "+a.add(7,6)+" "+a.add(10,10));
    }
}