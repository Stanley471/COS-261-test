import java.util.Scanner; //importing the Scanner class
public class largestNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); //Creating an object of the Scanner class
        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();  
        int largest = Math.max(a, Math.max(b, c));  //Using the Math methods to find maximum value
        System.out.println("Largest: " + largest);  
    }
}
