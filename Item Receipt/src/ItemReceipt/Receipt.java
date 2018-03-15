package ItemReceipt;

import java.util.ArrayList;

public class Receipt
{
   private ArrayList<String> saleList;
   private ArrayList<Item> purchasedItems;

   public Receipt(ArrayList<String> s, ArrayList<Item> p)
   {
      this.saleList = s;
      this.purchasedItems = p;
   }

   //TODO: returns an ArrayList with the items being purchased that are on sale
   public ArrayList<Item> findSaleItems()
   {
     ArrayList<Item> saleItems = new ArrayList<Item>();
     
       for (int i = 0; i < saleList.size(); i++) {
           for (int j = 0; j < purchasedItems.size(); j++) {
               if (purchasedItems.get(j).getName().equals(saleList.get(j))) {
                   saleItems.add(purchasedItems.get(j));
               }
           }
       }
           
       
       
       
       
    return saleItems;
   }
   
   //TODO: returns the subtotal of items being purchased (does not include discount)
   public double subtotal(ArrayList<Item> items)
   {
      double total = 0;
       for (int i = 0; i < purchasedItems.size(); i++) {
           total += (items.get(i).getPrice());
       }
       return total;
   }
   
   //TODO: returns the amount of discount earned (where each sale Item is 50% off)
   public double discount(ArrayList<Item> items)
   {
    double totalDiscount = 0; 
        for (int i = 0; i < saleList.size(); i++) {
            for (int j = 0; j < purchasedItems.size(); j++) {
                if (saleList.get(i).equals(purchasedItems.get(j))) {
                    
                }
            }
       }
    return totalDiscount;
   }

   // TODO: Prints the receipt
   public void printReceipt()
   {
       
       
       
   }

}