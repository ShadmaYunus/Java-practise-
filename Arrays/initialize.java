import java.util.Scanner;
public class access{
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

        // display the array 
        for(int i=0; i<n; i++){
            System.out.println("The array elements are : "+ arr[i]);
        }
    }
}