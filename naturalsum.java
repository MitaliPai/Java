// package Java;
import java.util.*;

public class naturalsum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter natural number : ");
        int n=sc.nextInt();
        int i,sum=0;

        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}