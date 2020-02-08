
package Candies;
public class Lollipop extends Candy{
public Toffies(){

super();
this.candyName = "Lollipop";
this.percentSugar = 10.0;
this.percentWater = 20.0;
this.percentMilk = 30.0;
this.price = 40;
}
public int getPrice(){
return this.price;}
public void getComposition(){
System.out.println("The Lollipop compostion is:");
System.out.println("The % sugar is:"+ percentSugar);
System.out.println("The % milk is:"+ percentMilk);
System.out.println("The % water is:"+ percentWater);}

public String toString(){
return "--Lollipop--\n";
}
}