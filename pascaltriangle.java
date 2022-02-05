import java.math.BigInteger;
import java.util.Scanner;
public class pascaltriangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter number of lines");
        int n=sc.nextInt();
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("11");
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=n-i;j++)
          {
              System.out.print(" ");
          }
          String s=a+"";
          a=a.multiply(b);
          for(int j=0;j<s.length();j++)
          { 
            System.out.print((Character.getNumericValue(s.charAt(j)))+" ");
          }
          System.out.println("");
        }
    }
}
