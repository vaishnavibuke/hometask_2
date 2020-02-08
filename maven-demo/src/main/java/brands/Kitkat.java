package brands;
	public class Kitkat extends Brands{
	public Kitkat()
	{
	super();
	this.brandname = "Kitkat";
	this.owner = "Nestle";
	this.price = 25;}
	
	public int getPrice(){
	return this.price;
	}
	
	public Strings toString(){
	return "--Kitkat--\n";}

	
	public void getBrandOwner(){
	String str = brandname + "is owned by "+owner ;
	System.out.println(str);
	}
}
