package tjmaxx;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TJMaxx abc = new TJMaxx();
		
		
		
		abc.addRegularItem(new Item("Shirt", 1, 1, 1.00));
		abc.addOnSaleItem(new OnSaleItem("Skirt", 2, 2, 1.00, 20));
		
		System.out.println(abc.getItemPrice(1));
		System.out.println(abc.regularItemsCount());
		System.out.println(abc.getOnSaleItem("Shirt"));
		System.out.println(abc.onSaleItemsCount());
		System.out.println(abc.getAllItemNames());
		System.out.println(abc.getOnSaleItem("Skirt"));
		abc.buyItem(1);
		System.out.println(abc.getAllItemNames());
		abc.buyItem(1);
		System.out.println(abc.getAllItemNames());
System.out.println(Math.round(9.99*1000*(100-20)/100)/1000.0);
	
		double cal = 10.2;
		System.out.println((int)cal);

	}

}
