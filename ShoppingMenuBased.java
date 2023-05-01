//1
import java.util.ArrayList;
 
public class ShopingCart {
 
ArrayList<Item> items=new ArrayList<Item>();
 
//add
public void add(Item item) {
items.add(item);
}
 
//remove
public void remove(Item item) {
items.remove(item);
}
 
//display
public void display() {
 
if(items.isEmpty()) {
System.out.println("The cart is empty");
}else {
for(Item it: items) {
System.out.println(it);
}
}
}
 
//claculate Total
public double getTotal() {
double totalCost=0.0;
for(Item it: items) {
totalCost=totalCost+it.getPrice();
}
return totalCost;
}
}
//2
public class Item {
 
private String Name;
private double price;
 
 
public Item() {
super();
// TODO Auto-generated constructor stub
}
 
public Item(String name, double price) {
super();
Name = name;
this.price = price;
}
public String getName() {
return Name;
}
public void setName(String name) {
Name = name;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
 
public String toString() {
return "Item [Name=" + Name + ", price=" + price + "]";
}
 
 
}
//3
import java.util.*;
public class App {
 
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
 
ShopingCart cart=new ShopingCart();
System.out.println("Enter the name of item");
String name=sc.nextLine();
System.out.println("Enter the price of item");
double price=sc.nextDouble();
 
Item item=new Item(name,price);
sc.nextLine();
System.out.println("Enter the name of item");
String name1=sc.nextLine();
System.out.println("Enter the price of item");
double price1=sc.nextDouble();
 
Item item1=new Item(name1,price1);
System.out.println("=========================================");
cart.add(item);
cart.add(item1);
 
cart.display();
System.out.println("=========================================");
double price3=cart.getTotal();
System.out.println("The total price before removing element "+price3);
 
cart.remove(item1);
System.out.println("=========================================");
double price4=cart.getTotal();
System.out.println("The total price is "+price4);
}
}
