package Chocolates;
public class Munch extends Chocolate{

public Munch(){
super();
this.chocolateName = "Munch";
this.confectioner = "Willy Wonka";
this.percentChoco = 12.05;
this.percentMilk = 14.05;
this.price = 15;
}
public int getPrice(){
return this.price;}

public void getComposition(){

System.out.println("The Munch compostion is:");
System.out.println("The % milk is:"+ percentMilk);
System.out.println("The % choco is:"+ percentChoco);}
public void getConfectioner(){
System.out.println("Confectioner :"+ Confectioner);}
@Override
public String toString(){
return "--Munch--\n";
}
}