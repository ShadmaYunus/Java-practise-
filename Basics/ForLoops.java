import java.util.Scanner;
public class ForLoops{
    public static void main(String[] args){
        int even=0;int odd=0;
        int sumeven=0;int sumodd=0;int max=0;
        for (int i=0 ; i<=100 ; i++){
            if(i%2==0){
                sumeven=i+sumeven;
                even=even+1;  
            }
            if(i%3==0){
                sumodd=sumodd+i;
                odd=odd+1;
            }
            if(i%7==0 && i>=max){
                max = i;
                
            }
            else{
                continue;
            }
        }
        System.out.println("Even count : "+even);
        System.out.println("Odd count : "+odd);
        System.out.println("Sum of even numbers : "+sumeven);
        System.out.println("Sum of odd numbers : "+sumodd);
        System.out.println("Largest number divisible by 7 : "+ max);
    }
}
