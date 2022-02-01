import java.util.Arrays;
import java.util.Scanner;

public class permutationlex {
    public static void main(String[] args)
    {
        int l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length");
        l=sc.nextInt();
       //input
        int n[]=new int[l];
        int a=0;
        System.out.println("Input array");
        for(int i=0;i<l;i++)
        {n[i]=sc.nextInt();
        }
        //main code
        for(int t=l-1;t>=0;t--)
        {
            for(int j=l-1;j>=0;j--)
            {
                if(n[t]>n[j]) {
                    a = n[t];
                    n[t] = n[j];
                    n[j] = a;
                    t = -1;
                    j = -1;
                }
            }
        }
        //print
        for(int i=0;i<l;i++)
        {System.out.print(n[i]+",");
        }
    }
}
