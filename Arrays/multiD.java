import java.util.Scanner;
public class multiD
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row number : ");
        int rows = sc.nextInt();

        System.out.print("Enter the column number : ");
        int cols = sc.nextInt();

        int[][] arr= new int[rows][cols];

        System.out.print("Enter the array elements : ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //display them//
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.println("arr [" + i + "]["+ j +"] = " + arr[i][j]);
            }
        }


    }
}