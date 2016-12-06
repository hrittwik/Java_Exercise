package esg.itp.shape;

public class Square {
	float side;
	float area;
	float perimeter;
	
	Square(float s){
		this.side = s;
	}
	
	void calcArea(){
		area = this.side*this.side;
	}
	
	void calcPerimeter(){
		perimeter = 4 * this.side;
	}
	
	void showDisplay(){
		System.out.println("Area of Square" + area);
		System.out.println("Perimeter of Square" + perimeter);
	}
}
