package sample03;

import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SungJukImpl  implements SungJuk {
	private SunJukDTO sungJukDTO = null; // 필드 ,초기화
	
//	public SungJukImpl(SunJukDTO sunJukDTO) {
//		super();
//		this.sunJukDTO = sunJukDTO;
//	}

	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());	
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0); 
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		//System.out.println(sunJukDTO.getName()
		//				   +"\t"+sunJukDTO.getKor()
		//				   +"\t"+sunJukDTO.getEng()
		//				   +"\t"+sunJukDTO.getMath()
		//				   +"\t"+sunJukDTO.getTot()
		//				   +"\t"+sunJukDTO.getAvg());
		System.out.println(sungJukDTO); //public String toString(){...} 
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학 입력 : ");
		int math = scan.nextInt();
		
		sungJukDTO.setName(name);
		sungJukDTO.setKor(kor);
		sungJukDTO.setEng(eng);
		sungJukDTO.setMath(math);
	}


	
}
