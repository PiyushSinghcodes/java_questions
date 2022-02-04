import java.util.Scanner;
public class pascaltriangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter number of lines");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=n-i;j++)
          {
              System.out.print(" ");
          }
          String s=(int)Math.pow(11,i-1)+"";
          for(int j=0;j<s.length();j++)
          { 
            System.out.print((Character.getNumericValue(s.charAt(i)))+" ");
          }
          System.out.println("");
        }
    }
}
