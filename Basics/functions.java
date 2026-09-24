import java.util.Scanner;
public class functions {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else{
            z = (x+y)*9;
        }
        return z;
    }
    public static void main(String[] args){
        int a = 4;
        int b= 3;
        int c = logic(a,b);
        System.out.println(c);

    }
}