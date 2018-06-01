
public class Shape {
	double side,length,breadth;
	
public Shape(double side) {
	this.side=side;
	
}
public Shape(double length,double breadth) {
	if(length <0.0 && length <20.0 && breadth >0.0 && breadth <20.0) {
		this.length=length;
		this.breadth=breadth;				
	}
	else {
		System.out.println("length and breadth is should be <0.0 and >20.0");
						
	}
}
	public double Shape() {
		return length*breadth;
	}
		public static void main(String args[]){
		Shape Rectangle=new Shape(5,25);
		System.out.println(Rectangle.Shape());				
		
		}		
	
	
}
