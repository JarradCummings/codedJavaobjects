/*
Cummings,Jarrad
CSC210
*/

//20% from $59

public class Discount
{
   public static void main(String[] args)
   {
      //Variables to hold the regular price, the
      //amount of a discount, and the sale price.
      double regularPrice = 59.0;
      double discount;
      double salePrice;
      
      //Calculate the amount of a 20% discount.
      discount = regularPrice * 0.2;
      
      //Calulate the sale price by subtracting
      //the discount from the regular price.
      salePrice = regularPrice - discount;
      
      //Display the results.
      System.out.println("Regular price: $" + regularPrice);
      System.out.println("Discount amount $" + discount);
      System.out.println("Sale price: $" + salePrice);
     }
    } 