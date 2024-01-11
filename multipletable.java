package Java;
import java.util.*;
public class multipletable {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int i,mul=0;
    System.out.println("Enter number to calculate multiplication table");
    int n=sc.nextInt(); 
    for(i=0;i<=10;i++)
    {
        mul=n*i;
        System.out.println(mul);
    }
   } 
}
