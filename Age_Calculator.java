
import java.util.Scanner;

public class Age_Calculator {
    public static int m1,m2,d1,d2,y1,y2,dd,dm,dy;
    public static int d[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static int df[]={0,31,29,31,30,31,30,31,31,30,31,30,31};

    public static void inp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input date of birth");
        System.out.println("Input date ");
        d1=sc.nextInt();
        System.out.println("Input month");
        m1=sc.nextInt();
        System.out.println("Input year");
        y1=sc.nextInt();
        System.out.println("Input age when you have to calculate");
        System.out.println("Input date ");
        d2=sc.nextInt();
        System.out.println("Input month");
        m2=sc.nextInt();
        System.out.println("Input year");
       y2 =sc.nextInt();

    }
    public static void year()
    {
        if(m2>m1)
        {
           dy= y2-y1;
           if(d2>=d1)
           {
               dm=m2-m1;
           dd=d2-d1;
           }
           else
           {
               dm=m2-m1-1;
               dd=d2-d1+(y1%4==0?df[m1]:d[m1]);
           }

        }
        else if(m2<m1)
        {
            dy=y2-y1-1;
            dm=m2+12-m1-1;
            dd=(y1%4==0?df[m1]:d[m1])-d1+d2;
        }
        else if(m1==m2)
        {

            if(d2>=d1)
            {
                dy=y2-y1;
                dm=0;
                dd=d2-d1;
            }
            else
            {
               dy=y2-y1-1;
                dm=10;
                dd=(y1%4==0?df[m1]:d[m1])-d1+d2;
            }

        }
    }
    public static int days()
    {
        int sum=(y1%4==0?df[m1]:d[m1])-d1+d2;

        for(int i=y1+1;i<y2;i++)
        {
            sum+=i%4==0?366:365;
        }
        if(y2>y1)
        for(int i=1;i<=12;i++)
        {
            sum+=i>m1?(y1%4==0?df[i]:d[i]):0;
            sum+=i<m2?(y2%4==0?df[i]:d[i]):0;
        }
        return sum;
    }

    public static void main(String[] args) {
        inp();
        year();
        if(dy<0||dm<0||dd<0)
        {System.out.println("Bhai time travel abhi possible nahi hai");}
         else {
            System.out.println(dy + " years " + dm + " months " + dd + " day on earth");
            System.out.println("OR "+(dy*12+dm) + " months " + dd + " day on earth ");
            System.out.println("OR "+(days()/7)+" weeks "+(days()%7)+" day on earth");
            System.out.println("OR " + days()+ " day on earth ");
            System.out.println("OR " + (days()*24)+ " hours on earth ");

        }


    }
}
