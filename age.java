// package Java;
import java.util.*;
public class age 
{
    public static void main(String[] args) {
        // int age;
        // System.out.print("Enter age :");

        Scanner sc=new Scanner(System.in);
        // age=sc.nextInt();
        System.out.print("Enter value of a :");
        int a=sc.nextInt();
        System.out.print("Enter value of b :");
        int b=sc.nextInt();
        // if(age>=18)
        //  if(age%2==0)
        // {
        //     // System.out.println("Adult");
        //     System.out.println("Even");
        // }
        // else
        // {
        //     // System.out.println("Not Adult");
        //     System.out.println("Odd");
        // }

        if(a==b)
        {
            System.out.println("Equal");
        }
        else if(a<b)
        {
            System.out.println("a is less than b");
        }
        else
        {
            System.out.println("a is greater than b");
        }
    }
}
