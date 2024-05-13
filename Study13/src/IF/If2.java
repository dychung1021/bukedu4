package IF;

public class If2 {
	public static void main(String[] args) {
		int number=101;
		number*=-1;//A+=B A=A+B A/=B A=A/B
		if(number>0) {
			System.out.println("양수입니다");
			if(number>100) {System.out.println("100보다 큰 수입니다");
			if(number%2==0) {System.out.println("짝수입니다");
				
				}//if(number%2==0)
			}//if(number>100)
			System.out.println("외부조건만 만족하면 내부 조건과 무관하게 실행");
		}//if(number>0)
		System.out.println("if문과는 무관하게 실행");
	}//main
}//class
