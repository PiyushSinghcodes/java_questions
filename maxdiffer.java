public class maxdiffer {
    
    public static void main(String[] args) {
            System.out.println("Hello, World!");
            int[] a={2,3,10,6,8,1};
            maxdiff(a,6);
        
    }
   public static void maxdiff(int[] arr,int n){

    int max=arr[1]-arr[0];
    int min=arr[0];
    for(int i=1;i<n;i++)
    {
        max=(int)Math.max(max,arr[i]-min);
        if(min>arr[i])
        {
            min=arr[i];
        }
       
    }
    System.out.println(max);  
   } 
}
