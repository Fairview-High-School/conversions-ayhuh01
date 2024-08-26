import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Liters to Gallons");
        System.out.println("8. Gallons to Liters");
        System.out.println("9. Pounds to Kilograms");
        System.out.println("10. Kilograms to Pounds");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * (5.0 / 9.0) ;
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celcius");
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
         if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * (0.3048) ;
            System.out.println(feet + " feet is " + meters + " meters");
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters / (0.3048) ;
            System.out.println(meters + " meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces / (0.033814) ;
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters * (0.033814) ;
            System.out.println(milliliters + " milliliters is " + ounces + " milliliters");
        }
         if (selection == 7)
        {
            System.out.println("Enter Liters: ");
            double liters = keyboard.nextDouble();
            keyboard.nextLine();
            double gallons = liters * (0.264172) ;
            System.out.println(liters + " liters is " + gallons + " gallons");
        }
         if (selection == 8)
        {
            System.out.println("Enter Gallons: ");
            double gallons = keyboard.nextDouble();
            keyboard.nextLine();
            double liters = gallons / (0.264172) ;
            System.out.println(gallons + " gallons is " + liters + " liters");
        }
          if (selection == 9)
        {
            System.out.println("Enter Pounds: ");
            double pounds = keyboard.nextDouble();
            keyboard.nextLine();
            double kilograms = pounds / (2.2) ;
            System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        }
          if (selection == 10)
        {
            System.out.println("Enter Kilograms: ");
            double kilograms = keyboard.nextDouble();
            keyboard.nextLine();
            double pounds = kilograms * (2.2) ;
            System.out.println(kilograms + " kilograms is " + pounds + " pounds");
        }
        //add more if statements here.
    }
}
