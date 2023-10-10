import java.io.*;
import java.util.*;

class Animal
{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("I am flying");
    }
    void sing()
    {
        System.out.println("I am singing");
    }
}
public class JavaInheritance01
{
    public static void main(String[] args) 
    {
       Bird b = new Bird();
       b.walk();
       b.fly();
       b.sing();
    }
}
