import java.util.Scanner;

class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double efficiency = 0;
        double price = 0;
        String trash = "";
        boolean done = false;


        do
        {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble())
            {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        done = false;


        do
        {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble())
            {
                efficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        }
        while (!done);

        done = false;


        do
        {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble())
            {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);


        double cost = (100 / efficiency) * price;
        double distance = gallons * efficiency;

        System.out.println("Cost to drive 100 miles: $" + cost);
        System.out.println("Distance the car can travel with a full tank: " + distance + " miles");
    }
}