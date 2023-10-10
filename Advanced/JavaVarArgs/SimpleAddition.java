public class SimpleAddition 
{
    public void add (int... a)
    {
        String b = "";
        int c = 0;
        for(int i : a)
        {
            b = b + i + "+";
            c = c + i;
        }
        System.out.print(b.substring(0, b.length()-1));
        System.out.println("="+ c);
    }
}