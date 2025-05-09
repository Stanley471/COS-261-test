import java.util.Scanner; //importing the Scanner class
public class evenOrOdd {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); //Creating an object of the Scanner class
        System.out.print("Enter a number: ");
        int num = input.nextInt();  //Enters number
        System.out.println(num % 2 == 0 ? "The number is Even" : "The number is Odd");  
    }
}
