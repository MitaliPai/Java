public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
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
