import java.util.*;
public class Solution 
{
    public static void EvenOddCheck(String str)
    {
        StringBuffer even = new StringBuffer();
        StringBuffer odd = new StringBuffer();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if( i % 2 == 0)
            {
                even.append(ch);
            }
            else
            {
                odd.append(ch);
            }
        }
        System.out.println(even + " " + odd);
    }
    public static void main(String ... args)
    {
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        for(int j = 0; j < num; j++)
        {
            String str1 = sc1.next();
            EvenOddCheck(str1);
        }
    }
}
