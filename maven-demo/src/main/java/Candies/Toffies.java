package Candies;
public class Toffies extends Candy{
public Toffies(){

super();
this.candyName = "Toffies";
this.percentSugar = 10.35;
this.percentWater = 20.35;
this.percentMilk = 30.35;
this.price = 30;
}
public int getPrice(){
return this.price;}
public void getComposition(){
System.out.println("The Toffies compostion is:");
System.out.println("The % sugar is:"+ percentSugar);
System.out.println("The % milk is:"+ percentMilk);
System.out.println("The % water is:"+ percentWater);}

public String toString(){
return "--Toffies--\n";
}
}