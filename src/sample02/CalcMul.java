package sample02;


import org.springframework.beans.factory.annotation.Value;

import lombok.Setter;

public class CalcMul implements Calc {
	
	@Setter
	private int x,y;

	//public void setX( int x) {
	//	this.x = x;
	//}
	
	
	//public void setY( int y) {
	//	this.y = y;
	//}

	@Override
	public void calculate() {
		System.out.println(x + " * " + y + " = " + (x*y));
	}


	
	
}
