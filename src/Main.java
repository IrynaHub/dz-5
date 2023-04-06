import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        int a =100;
        int b =200;
        int c = 1500;
        int d =500;


        int sum1 =a+b;
        int sum2 =c+d;


        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println(sum1>=sum2);

        System.out.println(++sum1);
        System.out.println(sum2-=2);

        System.out.println(sum1<sum2);


       int o1 =sum1 % 2;
       System.out.println(o1);

       int o2 =sum2 % 2;
       System.out.println(o2);

       System.out.println((sum1 % 2 == 1) || (sum2 % 2 == 0));

    }
}