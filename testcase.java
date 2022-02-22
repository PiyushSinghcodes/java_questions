import java.util.*;
class testcase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		int a[]=new int[s];
		int b[]=new int[s];
		
		int x[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        x[i][j]=0;
		    }
		}
		for(int i=0;i<s;i++)
		{
		    a[i]=sc.nextInt();
		    b[i]=sc.nextInt();
		    for(int j=0;j<m;j++)
		    {x[a[i]][j]+=1;;}
		    for(int j=0;j<n;j++)
		    {x[j][b[i]]+=1;}
		    
		}
		int o=0;
		
			for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        o=x[i][j]%2==0?o+1:o;
		    }
		}
		System.out.println(o);
	}
}
