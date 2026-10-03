import java.util.Scanner;
public class addressoned{
    public static void main(String[] args){
     int B_A = 1000;
     int size = 4;
     int L_B = 2001;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the year for its adresss babezy : ");
     int i = sc.nextInt();
     int adress =  B_A +(i-L_B)*size;
     System.out.println("The Address of " + i + " is : " + adress);
    }
    
}