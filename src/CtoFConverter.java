import java.util.Scanner;

class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";
        boolean done = false;



        do
        {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid temperature.");
            }
        } while (!done);


        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit);
    }
}