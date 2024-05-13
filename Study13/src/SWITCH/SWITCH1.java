package SWITCH;

public class SWITCH1 {
	public static void main(String[] args) {
		//switch문 : 변수의 값에 따라 실행위치를 결정하는 제어문, 단지 시작점으로 jump 그 이후는 모두 수행
		//switch(변수이름){case 값:실행할 문장}
		//선별기능이 없지만 break를 이용하여 선별을 가능하게 됨. switch문 밖에서는 break문과 상관없이 수행됨
		//case 중에 해당 숫자가 없으면 종료
		int score=100;
		switch(score) {
		case 50:System.out.println("50점 입니다");
		case 100:System.out.println("100점 입니다");
			break;
		case 150:System.out.println("150점 입니다");
		default : System.out.println("나는 case 해당값이 없을 때 default로 하는 부분입니다. 하지만 default 아래부분은 모두 수행");
		}
	System.out.println("나는 break와 무관하지롱");
	}
}


