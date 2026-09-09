import java.util.Scanner;
public class VowelConsonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a characterless character : ");
        char letter = sc.next().charAt(0);
        char Letter = Character.toUpperCase(letter);

        if(Letter=='A' || Letter=='E' || Letter=='I' || Letter=='O' || Letter=='U'){
            System.out.print(letter + "is a consonant");
        }
        else{
            System.out.print(letter + "is a vowel");
        }

    }
}