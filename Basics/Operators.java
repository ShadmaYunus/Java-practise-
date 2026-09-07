import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b= sc.nextInt();
        System.out.println("Addition :"+(a+b));
        System.out.println("Subtraction : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division  : "+(a/b));
        System.out.println("Remainder : "+(a%b));
        System.out.println("is a greater than b?" +(a>b));
        sc.close();

    }
}