import java.util.Scanner;
public class Factorial{
    static int factorial(int b){
        int fact=1;
        for(int i = b ; i>=1 ; i--){
            fact = fact * i;

        }
        return fact;
    }
public static void main(String[] args){
    int result;
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter the number : ");
    int a = sc.nextInt();

    result = factorial(a);
    System.out.println(result + " is the factorial of " + a);

}
}