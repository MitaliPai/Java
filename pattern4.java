public class pattern4 {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // for(int j=1;j<=n-1;j++)
            // {
            //     System.out.println(" ");
            // }
            System.out.println(" ");
        }
    }
}
