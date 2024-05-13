package ifelse;

public class IFELSE {
	public static void main(String[] args) {
		/*if(조건1){조건이 true일 경우 수행할 문장;}
		  조건1 : 계산의 결과가 true 또는 false로 나오는 것
		  else if(조건2) {조건 1이 거짓이고 조건2가 참일 때 수행할 문장} 
		  else {위쪽의 모든 조건이 거짓일 경우 수행되는 문장} 
		  매우 중요 *** 조건은 좁은 것부터 차차 넓어지도록 작성하지 않으면 아래쪽은 영원히 실행되지 않는다.
		  */
		int score=70;
		if(score>95) {
			System.out.println("A+ 학점입니다");}
		else if(score>90) {
			System.out.println("A 학점입니다.");}
		else if(score>85) {
			System.out.println("B+ 학점입니다.");}
		else if(score>80) {
			System.out.println("B 학점입니다.");}
		else if(score>75) {
			System.out.println("C+ 학점입니다.");}
		else if(score>70) {
			System.out.println("C 학점입니다.");}
		else if(score>65) {
			System.out.println("D+학점입니다.");}
		else if(score>60) {
			System.out.println("D 학점입니다.");}
		else {
			System.out.println("F 학점입니다.");}
	}

}
