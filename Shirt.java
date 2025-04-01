package product_project;

public class Shirt extends Product {
	int size;
	String color;
	Shirt(){
		
	}
	Shirt(String brand,double price,String category,int size,String color){
		super(brand,price,category);
		this.size=size;
		this.color=color;
		
		
	}
	
	public String toString() {
		return "Brand: "+brand+"\tPrice: "+price+"\tCategory: "+category+"\tSize: "+size+"\tColor: "+color;
	}

}
