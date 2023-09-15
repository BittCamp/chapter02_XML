package sample02;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class CalcAdd implements Calc {
	
	@NonNull
	private int x,y;
	
	//public CalcAdd(@NonNull int x, @NonNull int y) {
	//	super();
	//	this.x = x;
	//	this.y = y;
	//}
	
	
	
	@Override
	public void calculate() {
		System.out.println(x + " + " + y + " = " + (x+y));
	}





}
