package product_project;

public class Driver {
public static void main(String[] args) {
	ProductService service = new ProductService();
	service.addProduct(new Shirt("Arrow",2300,"clothing",40,"white"));
	service.addProduct(new Shirt("H&M",2300,"clothing",40,"Black"));
	service.addProduct(new Mobile("Google",67000,"Electronics",8,512,"white"));
//	service.getAllProdutsOnCategory();
//	service.getProductCountOnCategory();
	service.getAllCategory();
	service.getProductType();
}
}
