package EE;

public class op2 {
	public static void main(String[] args) {
		// 논리연산자 : true, false를 가지고 true, false를 계산하는 연산자
		// 한개만 적으면 전혀 다른 연산자이니 주의
		// && : and 연산자 ~이고 ~이다 모두 true일 때만 true
		// || :  or 연산자 ~이거나 ~이다 하나만 true이더라도 true
		
		boolean result;
		result = true&&false;
				System.out.println(result);
		/*
		 true	&&	true	true
		 true	&&	false	false
		 false	&&	true	false
		 false	&&	false	false
		 
		 true	||	true	true
		 true	||	false	true
		 false	||	true	true
		 false	||	false	false
		 */
		String id="admin";
		String pw="1111";
		result=(id=="admin") && (pw=="1111");
				System.out.println(result);
				
		int number=7;
		// number가 3보다 작거나 5보다 큰지를 확인하여 결과를 result에 담고 이를 출력하시오
		
		result = (number <3) || (number >5);
		System.out.println(result);
		// number가 3보다 크고 6보다 작거나 같은지를 확인하여 결과를 result에 담고 이를 출력하시오
		
		result = (number >3) && (number <=6);
		System.out.println(result);
		}
}
