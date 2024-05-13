package EE;

public class op4 {
	public static void main(String[] args) {
		// 삼항연산자
		// A?B:C : A가 참이면 B수행 A가 거짓이면 C 수행
		// 조건에 따라 실행할 부분을 결정하는 연산자
		// 기능은 좋으나 가독성이 떨어져서 많이 사용하지 않음.
		int number=10;
		String result;
		result=(number>=10)? "참":"거짓";
		System.out.println(result);
	}
}
