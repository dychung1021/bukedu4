package fo;

public class FOR3 {
	public static void main(String[] args) {
		//break : 제어문이 가지고 있는 동작을 정지시키는 효과
		//반복문의 외부에서는 break의 영향을 받지 않음
		//continue; 제어문이 가지고 있는 동작을 처음으로 돌아가는 효과
		//continue가 발생하면 그 아랫부분이 동작하지 않는 효과가 있다.
		for(int i=0;i<10;i++) {
			//System.out.println(i);
			if(i%2==0) {
			//break;
			continue;
			}//if
			System.out.println(i);
		
	}//for

		System.out.println("반복문의 외부에서는 break의 영향을 받지 않음");
		
		//while :{}내의 내용을 반복해서 수행하는 제어문법
		//while(조건){반복해서 수행할 문장;} 조건이 true인 한 문장수행
		//do{} while(); {}내를 일단 1번은 하고 나서 while() 조건을 check
		int a=1;
		do
		 {
			System.out.println("반복중 ..."+a);
			a--;
		}while(a>1);
	}//main
}//class
