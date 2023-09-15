package sample03;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SunJukDTO {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	@Override
	public String toString() { // 이거 주석걸면.SungJukImpl에서 System.out.println(sunJukDTO);  할때 16진수 주소값나옴.
		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+ String.format("%.2f",avg) ;
	}
}
