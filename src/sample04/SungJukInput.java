package sample04;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;


public class SungJukInput implements SungJuk {
	@Setter
	private SungJukDTO2 sungJukDTO2; //필드 초기화
	@Setter
	private List<SungJukDTO2> list;
	
	//public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) {//세터로 가져옴. 롬복쓰면 세터빠짐.
	//	this.sungJukDTO2 = sungJukDTO2;
	//}

	//public void setList(List<SungJukDTO2> list) {
	//	this.list = list;
	//}
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이    름 입력 : ");
		String name = scan.next();
		System.out.println("국어점수 입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어점수 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학점수 입력 : ");
		int math = scan.nextInt();
		System.out.println();
		
		int tot = kor + eng + math;
		double avg = tot/3.0;
		
		//SungJukDTO2 sungJukDTO2 = new SungJukDTO2(); new 로 쓰지 않겠다. 세터를 가져왔기 때문에. 호출 안써도 됨.
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		
		//ArrayList<SungJukDTO2> list = new ArrayList<SungJukDTO2>(); 이거안쓰고 빈으로 한다. 의존관계로.
		list.add(sungJukDTO2);
		//System.out.println(list); 확인용
		
		System.out.println(sungJukDTO2.getName()+ "님의 데이터를 입력 하였습니다");
		
	}


}
