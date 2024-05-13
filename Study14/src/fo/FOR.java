package fo;

public class FOR {
	public static void main(String[] args) {
		//for문 :()내부의 내용을 반복해서 수행하는 문법
		/*
		 for(시작점, 조건; 증감식){
		 반복해서 수행할 문장;}
		 */
		int i=0;
		for(i=0; i<3; i++) {
			System.out.println("반복수행 중..."+i);
		}
		System.out.println(i);
	}
}
