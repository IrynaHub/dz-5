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

        String compareSum1 = sum1>sum2 ? "true" : "false";
        System.out.println(compareSum1 );

        String compareSum2 = sum2>=sum1 ? "true" : "false";
        System.out.println(compareSum2);



        int sum3 =(++sum1);
        System.out.println(sum3);



        int sum4 =(sum2-=2);
        System.out.println(sum4);



       String compareSum3 =sum3>sum4 ? "true" : "False";
       System.out.println(compareSum3);

       String compareSum4 =sum3<sum4 ? "true" : "False";
       System.out.println(compareSum4);



       int o1 =sum3 % 2;
       System.out.println(o1);

       int o2 =sum4 % 2;
       System.out.println(o2);

       System.out.println(o1==2);
       System.out.println(o2!=2);

    }
}