public class Main
{
    public static void main(String[] args)
    {
       // Declare Variables
        double totalItemPrice = 50.00;
        double SALES_TAX = 0.05;
        double totalPrice = 0;


        totalPrice = totalItemPrice + (totalItemPrice * SALES_TAX);

        System.out.println("The price of the item is $" +  totalItemPrice);
        System.out.println("The sales tax is " + SALES_TAX + " percent ");
        System.out.println("The total price of the item is $" + totalPrice);
    }
}