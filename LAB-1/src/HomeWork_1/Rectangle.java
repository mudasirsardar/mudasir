package HomeWork_1;

public class Rectangle {

	public float length;
	public float width;
	
	Rectangle(){
		length=1.0f;
		width=2.0f;
	}
	
	Rectangle(float length,float width){
		this.length=length;
		this.width=width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	
	public double getArea() {
		return this.length*this.width;
	}
	
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
	
}

