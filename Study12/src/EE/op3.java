package EE;

public class op3 {
	public static void main(String[] args) {
		// 얘는 몰라도 개발에 지장 없음
		// 비트연산자 : 계산의 결과가 특정값을 보이도록 연산
		// 수를 이진수로 변환하여 자릿수별로 계산
		// & : 자릿수가 모두  1이면 1, 하나라도 0이면 0
		// | : 자릿수 중 하나라도  1이면 1, 모두 0이면 0
		// ^ : XOR, Exclusive or, 자릿수가 서로 다르면 1, 같으면 0
		
		int a=3;
		int b=5;
		int result1 =3&5;
		int result2 =3|5;
		int result3 =3^5;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		//2진수로 변환한 값을 확인하는 법
		int number=9;
		String data;
		data=Integer.toBinaryString(number);
		System.out.println(data);
		
		// Shift 연산자
		//  이진수로 변환해서 자릿수를 변화시키는 방법
		// A<<B : A를 이진수 변환해서 왼쪽으로 B칸 자릿수 증가
		// A>>B : A를 이진수 변환해서 오른쪽으로 B칸 자릿수 감소
		int result=a<<1;
		System.out.println(result);
		
		
	}

}
