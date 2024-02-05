import java.util.Scanner;
public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //calling scanner to program
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;
        //Prompt user to assign itemPrice
        System.out.print("Enter the item price: $ ");
        itemPrice = in.nextDouble();
        //calculate shipping and give appropriate output
        if (itemPrice >= 100) {
            shippingCost = 0;
            System.out.println(" Your shipping is: $ " + shippingCost);
            totalCost = itemPrice + shippingCost;
            System.out.print("Your total cost is: $" + totalCost);
        } else {
            shippingCost = 0.02 * itemPrice;
            totalCost = itemPrice + shippingCost;
            // output results for charged shipping
            System.out.println(" Your shipping is: $" + shippingCost);
            System.out.print("Your total cost is: $" + totalCost);
        }
    }
}