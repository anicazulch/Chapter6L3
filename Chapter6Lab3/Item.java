
// ***************************************************************

//   Item.java

//

//   Represents an item in a shopping cart.

// ***************************************************************


public class Item

{

    public String name;

    public double price;

    public int quantity;


    // -------------------------------------------------------

    //  Create a new item with the given attributes.

    // -------------------------------------------------------

    public Item (String itemName, double itemPrice, int numPurchased)

    {

        name = itemName;
        price = itemPrice;
        quantity = numPurchased;

    }


    // -------------------------------------------------------

    //   Return a string with the information about the item

    // -------------------------------------------------------

    public String toString ()

    {
       //Your code goes here
       return "Item name: " + name + " Cost: " + price + " Quantity: " + quantity;
    }


    } 