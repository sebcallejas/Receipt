
package ItemReceipt;
/*
* Sebastian Callejas
* Period 2
* Project: Item
*/

/**
 *
 * @author 18051
 */
public class Item
{
   //TODO: Instance variables to store information we want to remember about an Item
  private String name;
  private double price;
   //TODO: Constructor that takes any set up information and assigns
   //      the values to the instance variables.
  public Item (String nam, double pri){
      name = nam;
      price = pri;
  }
  public String getName(){
      return name;
  }
  public void setName(String pName){
      name = pName;
  }
  public double getPrice(){
      return price;
  }
  public void setPrice( double pPrice){
      price = pPrice;
  }
  public String toString (){
      return "Your item(s): "+name+"\nTotal price: "+price;
  }
  
   //TODO: Accessors for any information we want to access

   //TODO: Mutators for any information we want to be able to change
  
   //TODO: toString() for printing the Object
}

