package product_project;

public class Mobile extends Product {
	int ram;
	int hd;
	String color;
	
	Mobile(){
		
	}
	Mobile(String brand,double price,String category,int ram,int hd,String color){
		super(brand,price,category);
		this.ram=ram;
		this.hd=hd;
		this.color=color;
		
	}
	
	public String toString() {
		return "Brand: "+brand+"\tPrice: "+price+"\tCategory: "+category+"\tRAM: "+ram+"GB\tHard Disk: "+hd+"GB\tColor: "+color;
		
	}
}
