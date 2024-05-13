package IF;
import java.util.*;//Scanner를 포함한 평의기능들이 다 들어있는 묶음
public class if1 {
	public static void main(String[] args) {
		//if문 : 조건의 true false 여부에 따라 실행을 결정하는 제어문
		//if(조건){조건이 true인 경우 수행할 문장}
		//if문에{}를 지정하지 않으면 ()뒤에 나오는 첫번쩨 ; 까지를 자기의 {}범위로 본다
		int a=-5;
		
		System.out.println("if문 앞에 나온 부분은 조건과 무관합니다");
		if(a==5){
			System.out.println("조건이 참이므로 실행합니다");
			System.out.println("명령이 여러 개여도 수행합니다");
			a=25;
		}//if 문
		System.out.println(a);
		//if문을 제작하여 변수 a 내부의 값이 0보다 작으면
		//음수입니다를 출력하도록 작성하시오
		System.out.println("음수를 포함해서 숫자를 하나 입력해 주세요");
		Scanner b;
		b=new Scanner(System.in);
		a=b.nextInt();
		//Scanner b;는 int a; String c;와 같이 변수 b를 Scanner 형태로 지정
		if(a<0) {
			System.out.println("음수입니다");
		}
	}//main
}