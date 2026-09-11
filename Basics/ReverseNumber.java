import java.util.Scanner;
public class ReverseNumber{
    public static void main (String [] args){
        int num = 12345;
        int rev=0;
        int remainder =0;
        while (num > 0){
            remainder = num % 10;
            rev = rev *10 + remainder;
            num = num / 10 ; 
            

        }
        System.out.println("The reversed number is : "+ rev);
    }
}