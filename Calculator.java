import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter two numbers.");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float sum = a + b;
        float diff = a - b;
        float prod = a * b;
        float div = a / b;
        System.out.println("Would you like to add add (1), subtract (2), multiply (3), or divide (4)?");
        float c = input.nextFloat();
        if (c == 1)
        {
            System.out.println(sum);
        }
        else if (c == 2)
        {
            System.out.println(diff);
        }
        else if (c == 3)
        {
            System.out.println(prod);
        }
        else if (c == 4)
        {
            System.out.println(div);
        }
    }
}