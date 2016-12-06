package esg.itp.shape;

public class Rectangle {
	float length;
	float breadth;
	float perimeter;
	float area;
	
	Rectangle(float len, float brd){
		this.length = len;
		this.breadth = brd;
	}
	
	void calcArea(){
		
		area = this.length* this.breadth;
	}
	
	void calcPerimeter(){
		
		perimeter = 2*(this.length + this.breadth);
	}
	
	void showdisplay(){
		System.out.println("Area of Rectangle: " + area);
		System.out.println("Perimeter of Rectangle: " + perimeter);
	}
}
