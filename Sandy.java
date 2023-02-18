import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.Document;

public class Sandy {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String sa[]=br.readLine().trim().split(" ");
	 int n=Integer.parseInt(sa[0]);
     int A=Integer.parseInt(sa[1]);
     int B=Integer.parseInt(sa[2]);
	 	 int arr[]=new int[n];
	 
	      String s[]=br.readLine().trim().split(" ");
        int sum=0;int max=0;int ind=n-1;
	      for(int i=0;i<n;i++)
	      {
	          arr[i]=Integer.parseInt(s[i]);
              sum+=arr[i];
	         if(max<arr[i]&&i!=0)
             {max=arr[i];
            ind=i;}

	      }
          int j=0;
          double p=((double)(B))/arr[0];
          while(((double)(A))/sum<p&&j<n-1)
          {
            sum=sum-max;
            max=arr[n-1];
            j++;
            arr[ind]=0;
            for(int i=1;i<n;i++)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                    ind=i;
                }
            }

          }
          System.out.println(j);

	
    }
    
    
}
