public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                for(int k=j;k<=j;k++)
                {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
