
package Candies;
public class Candy{
protected double percentSugar;
protected double percentWater;
protected double percentMilk;
protected int price;
public Candy(){
super();
this.candyName = "candy";
this.percentSugar = 11.35;
this.percentWater = 22.35;
this.percentMilk = 33.35;
this.price = 35;
}
public int getPrice(){
return this.price;}
public void getComposition(){
System.out.println("The candy compostion is:");
System.out.println("The % sugar is:"+ percentSugar);
System.out.println("The % milk is:"+ percentMilk);
System.out.println("The % water is:"+ percentWater);}
@Override
public String toString(){
return "--Candy--\n";
}
}