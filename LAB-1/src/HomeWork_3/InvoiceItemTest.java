package HomeWork_3;

public class InvoiceItemTest {

	public static void main(String[] args) {
		InvoiceItem obj=new InvoiceItem(2, "Cocola", 10, 20);
		System.out.println("ID          :"+obj.getId());
		System.out.println("Description :"+obj.getDesc());
		System.out.println("Quantity    :"+obj.getQty());
		System.out.println("Unit Price  :"+obj.getUnitPrice());
		System.out.println("Total       :"+obj.getTotal());
		System.out.println(obj);
		
	}
}
