import java.util.Scanner;
public class initialize{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        int n;
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        
        // input the array size and elements
        int[] arr= new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        
        int sum = arr[0] + arr[n-1];
        System.out.println("The sum is : "+ sum);
        
    }
}