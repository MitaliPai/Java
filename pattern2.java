public class pattern2 {
    public static void main(String[] args) {
        int n=4,m=5;
        for(int i=1;i<=n;i++) 
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || j==1 || j==m || i==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
