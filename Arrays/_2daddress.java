import java.util.Scanner;
public class _2daddress{
    public static void main(String[] args){
        int B_A = 2000;
        int i = 4;
        int j = 14;
        int cols = 20;
        int size = 2;

        int address = ((i*cols + j)*size) + B_A;
        System.out.println("Address of c[" + i + "][" + j + "] is : " + address);

    }
}