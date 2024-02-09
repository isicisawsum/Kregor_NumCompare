import java.util.Scanner; //importing Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a random number: "); //asking user to input number 1
        double num1 = in.nextDouble(); //defining variable num2
        System.out.println("Choose another random number: "); //asking user to input number 2
        if (in.hasNextDouble()) //if/then to determine if user entered a number
        {
            double num2 = in.nextDouble(); //defining variable num2
            if (num1 > num2) //number 1 that user inputted is greater than number 2
            {
                System.out.println(num1 + " is greater than " + num2); //telling user num1 greater than num2
            }
            else if (num1 < num2) //number 1 that user inputted is less than number 2
            {
                System.out.println(num1 + " is less than " + num2); //telling user num1 less than num2
            }
            else
            {
                System.out.println(num1 + " is the same as " + num2); //telling user numbers are equal
            }
        }
        else
        {
            System.out.println("That’s not a number"); //telling user that they didn't input a number
        }
    }
}
