
public class ShipCostCalculator
{
    public static void main(String[] args)
    {   double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;
        String trash = "";
        //Prompt user to assign itemPrice
        System.out.println("Enter the item price: ");
        // fake scanner input
        itemPrice = 100.25;
        //complete program

        {
            if (itemPrice >= 100) {
                shippingCost = 0;
                totalCost = itemPrice;
            } else {
                shippingCost = 0.02 * itemPrice;
                totalCost = itemPrice + shippingCost;
            }
                // output results for charged shipping
                System.out.println("Your shipping is: $" + shippingCost);
                System.out.print("Your total cost is: $" + totalCost);

        }
    }
}