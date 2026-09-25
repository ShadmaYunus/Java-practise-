import java.util.Scanner;
 public class Palindrome{
    static Boolean isPalindrome(String b){
    int len= b.length();
    String reversed = "";
    for (int i= len-1; i>=0; i-- ){
        reversed = reversed + b.charAt(i);   
    }
    if(b.equals(reversed)){
        return true;
    }
    else{
        return false;
    }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string you want to check as palindrome");
        String a = sc.nextLine();
        Boolean check = isPalindrome(a);
        System.out.print(check?a + " is Palindrome" : a + " not Palindrome");

    }
     }

     