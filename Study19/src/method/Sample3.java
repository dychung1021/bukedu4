package method;
import java.util.Scanner;
public class Sample3 {
	public static void main(String[] args) {

		System.out.println("첫번째 숫자를 넣어주세요");
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();


		System.out.println("두번째 숫자를 넣어주세요");
		int num2=scan.nextInt();
		
		Exam e= new Exam();
		int result = e.sum(num1, num2);
		System.out.println(result+ "이 결과입니다.");
		e.check();
	}
}
class Exam{
	int a;
	int sum(int a, int b){
		System.out.println("두수를 더하면 다음과 같습니다.");
		this.a=a;//this를 안쓰면 a=a; 는 a 내부의 값이 0 즉 변수정의시 만들어진 빈값을 저장
		System.out.println(a);
		return a+b; //매개변수로 전달된 변수는 안써도 상관없다.
	}
	void check() {
			System.out.println("a 내부의 값 :"+a);// 매개변수와 필드의 이름이 같으면 매개변수를 먼저 사용,
											   // 필드에서 매개변수와 동일한 이름을 사용하지 말자
											   // this.필드변수 를 써주면 두개를 구분함. 
	}//void void는 return이 없다. 반환되는 값이 없으므로 변수에 지정도 불가.
}
