package brands;

public class Cadboury extends Brands{

	public Cadboury()
	{
	super();
	this.brandname = "Cadboury";
	this.owner = "Mondelez International";
	this.price = 5;}
	
	public int getPrice(){
	return this.price;
	}
	
	public Strings toString(){
	return "--Cadboury--\n";}

	
	public void getBrandOwner(){
	String str = brandname + "is owned by "+owner ;
	System.out.println(str);
	}

}
