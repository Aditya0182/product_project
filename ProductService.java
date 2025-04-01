package product_project;
import java.util.*;

public class ProductService {
	private List<Product> l1 = new ArrayList<>();
	
	public void addProduct(Product p) {
		l1.add(p);
		
	}
	public void getAllProducts() {
		for(Product p:l1)
			System.out.println(p);
		
	}
	public void getAllShirts() {
		for(Product p:l1) {
			if(p instanceof Shirt) {
				System.out.println(p);
			}
		}
	}
	public void getAllMobile() {
		for(Product p:l1) {
			if(p instanceof Mobile) {
				System.out.println(p);
			}
		}
}
	public void getAllProdutsOnCategory() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Category: ");
		String ucatg= sc.nextLine();
		for(Product p:l1) {
			if(p.category.equalsIgnoreCase(ucatg)) {
				System.out.println(p);
			}
		}
	}
	
	public void getProductCountOnCategory() {
		Map<String,Integer> m1=new HashMap<>();
		for(Product p:l1) {
			if(m1.containsKey(p.category)){
			m1.put(p.category, m1.get(p.category)+1);
			}else {
				m1.put(p.category, 1);
			}
			}
		Set<Map.Entry<String, Integer>> ent= m1.entrySet();
		for(Map.Entry<String, Integer>x:ent) {
			System.out.println(x.getKey()+"==>"+x.getValue());
		}
	}
	
	public void getAllCategory() {
		Set<String> s1= new TreeSet<>();
		for(Product p:l1) {
			s1.add(p.category);
		}
		System.out.println(s1);
	}
	
	public void getProductType() {
		Set<String> s1=new HashSet<>();
		for(Product p:l1) {
			if(p instanceof Shirt)
				s1.add("Shirt");
			else if(p instanceof Mobile)
				s1.add("Mobile");
			
		}
		System.out.println(s1);
	}
	
	public void removeProduct() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the product you want to remove: ");
		String product= sc.nextLine();
		
	}
}
