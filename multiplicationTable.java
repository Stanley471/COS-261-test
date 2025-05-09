import java.util.Scanner; //importing the Scanner class
public class multiplicationTable {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); //Creating an object of the Scanner class
        System.out.print("Enter a number: ");
        int num = input.nextInt();  
        for (int i=1; i<=10; i++) {  
            System.out.println(num + " x " + i + " = " + (num*i));  
        }  
    }  
}  
