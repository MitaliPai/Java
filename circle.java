package Java;
import java.util.Scanner; 
public class circle {
    public static void main(String[] args) {
        int r;
        double m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius :");
        r=sc.nextInt();
        m=r*r*Math.PI;
        System.out.print("Area of circle :"+m);

    }
}
