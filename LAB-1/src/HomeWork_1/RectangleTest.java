package HomeWork_1;

public class RectangleTest {
     
	public static void main(String[] args) {
		Rectangle obj1=new Rectangle();
		Rectangle obj2=new Rectangle(20, 10);
		
		System.out.println("Length    :"+obj2.getLength());
		System.out.println("Width     :"+obj2.getWidth());
		System.out.println("Area      :"+obj2.getArea());
		System.out.println("Perimeter :"+obj2.getPerimeter());
		
		System.out.println(obj2);
		
	}
	
	
	   
	
}
