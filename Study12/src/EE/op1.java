package EE;

public class op1{
	public static void main(String[] args){
		// 이항연산자
		//  산술연산자 : 계산의 결과가 특정한 값으로 나온다
		//  비교연산자 : 계산의 결과가 true false로 나온다
		//  >  : 왼쪽이 오른쪽보다 큰지 확인
		//  <  : 왼쪽이 오른쪽보다 작은지 확인
		//  >= : 왼쪽이 오른쪽보다 크거나 같은지 확인
		//  >= : 왼쪽이 오른쪽보다 작거나 같은지 확인
		//  == : 왼쪽이 오른쪽과 같은지 확인. 조건작성시 = 로 쓰지 않도록 주의
		//  != : 왼쪽이 오른쪽과 다른지 확인
		int a=10;
		int b=5;
		boolean result = a!=b;
		System.out.println("a가 아닌 것이 b이다 라는 명제는"+result);

		// a와b를 더한 값이 a와 b를 곱한 값보다 큰지 확인하여 결과를 result에 저장하고 
		// 이를 출력하시오
		int c=a+b;
		int d=a*b;
		result= c > d;
		System.out.println("a와 b의 합이 a와 b의 곱보다 크다는 명제는"+result);
	}
}