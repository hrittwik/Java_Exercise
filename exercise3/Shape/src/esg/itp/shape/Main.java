package esg.itp.shape;

public class Main {
	public static void main(String[] args){
		Rectangle r = new Rectangle(10, 10);
		Square s = new Square(4);
		
		s.calcArea();
		s.calcPerimeter();
		s.showDisplay();
		
		r.calcArea();
		r.calcPerimeter();
		r.showdisplay();
	}
}
