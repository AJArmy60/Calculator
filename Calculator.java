import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter two numbers.");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        int diff = a - b;
        System.out.println("Would you like to add add (1) or subtract (2) ?");
        int c = input.nextInt();
        if (c == 1)
        {
            System.out.println(sum);
        }
        else if (c == 2)
        {
            System.out.println(diff);
        }
        else
        {

        }
    }
}