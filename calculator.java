package Java;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        // System.out.println("Enter an operator: +,-,*,/");
        // char op;
        Scanner sc=new Scanner(System.in);
        // op=sc.next().charAt(0);
        // System.out.print("Enter value of a : \n");
        // double a=sc.nextDouble();
        // System.out.print("Enter value of b : \n");
        // double b=sc.nextDouble();
        // double m;

        System.out.println("Enter month number");
        int num=sc.nextInt();
        // switch(op)
        // {
        //     case '+': 
        //         m=a+b;
        //         System.out.println("Addition :"+m);
        //         break;

        //     case '-': 
        //         m=a-b;
        //         System.out.println("Subtraction :"+m);
        //         break;

        //     case '*': 
        //         m=a*b;
        //         System.out.println("Multiplication :"+m);
        //         break;

        //     case '/': 
        //         m=a/b;
        //         System.out.println("Division :"+m);
        //         break;    

        //     default:
        //         System.out.println("Invalid Input");
        //         break;
        // }


        switch(num)
        {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("December");
            break;
            default: System.out.println("Invalid input");
            break;

        }
    }
}
