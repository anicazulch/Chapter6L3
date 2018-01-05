// ***************************************************************

//   Shop.java

//

//   Uses the Item class to create items and add them to a shopping

//   cart stored in an ArrayList.

// ***************************************************************


import java.util.ArrayList;

import java.util.Scanner;


public class Shop

{

    public static void main (String[] args)

    {

        ArrayList<Item> cart = new ArrayList<Item>();

        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        String itemRemove = "y";


        while (keepShopping.equals("y")) 

            {

                System.out.print ("Enter the name of the item: ");

                itemName = scan.next();


                System.out.print ("Enter the unit price: ");

                itemPrice = scan.nextDouble();


                System.out.print ("Enter the quantity: ");

                quantity = scan.nextInt();


                // *** create a new item and add it to the cart
                Item thing = new Item(itemName, itemPrice, quantity);
                //^ thing holds the memory location
                cart.add(thing);
                // putting thing's memory location into the cart
                // that's why you can use the same variable name and add it repeatedly
                

                // *** print the contents of the cart object using println
                

                System.out.print ("Continue shopping (y/n)? ");

                keepShopping = scan.next();
            }
        checkOut(cart);

    }


    public static void checkOut(ArrayList<Item> yourCart) {
        Scanner scan = new Scanner(System.in);
        //You do NOT need a getter method (think about public instance variables)
        System.out.println(yourCart);
        System.out.println("Your cart contains");
        //ArrayList<int> itemsRemoved = new ArrayList<int>();
        //^throws an error bc an array list has to hold Intergers: object
        ArrayList<Integer> itemsRemoved = new ArrayList<Integer>();
        
        //Print the contents of the cart (you may use the toString() method
        for(int i = 0; i < yourCart.size(); i++){
            //array list doesn't have length, it has size
            System.out.println(yourCart.get(i));
            //array list using parentheses not brackets
            System.out.println("Remove this item? (y/n)");
            String answer = scan.next();
            if(answer.equals("y")) {
                //.equals bc it's a string
                //at first threw an error bc scanner scan = new Scanner() wasn't defined in this class
                //yourCart.remove(i); is a bad idea bc the size keeps changing
                itemsRemoved.add(i);
            }
        }
        for (int i : itemsRemoved){
            yourCart.remove(i);
        }

        //Ask the user if they would like to remove an item.  If yes, remove that item.
        

        //Print final total of items and final price (total)
        double total = 0;
        for(Item i : yourCart) {
            total += i.price * i.quantity;
        }
        
        System.out.println("You have purchases: " + yourCart + "\n for a cost of: " + total);
        
        }

     }