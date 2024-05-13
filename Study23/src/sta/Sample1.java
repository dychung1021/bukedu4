package sta;

public class Sample1 {
	public static void main(String[] args) {
		Sample2.Test();
		System.out.println("이렇게 가동합니다.");
//		Sample2.n_field = 10;
//		System.out.println(Sample2.n_field);
//		Sample2 s2=new Sample2();
		Sample2 A=new Sample2();
		Sample2 B=new Sample2();
		Sample2 C=new Sample2();
		A.s_field=10;
		B.s_field=20;
		C.s_field=30;

		System.out.println(A.s_field);
		System.out.println(B.s_field);
		System.out.println(C.s_field);
	}//main
	static void Test(){

		System.out.println("test 가동합니다.");
	}
}//sample
//public 완전공개된, void return type(return이 없는) main 이름 
//String[] String type의 배열, args arguments의 약자, 변수이름으로 지은 것일뿐 꼭 args라고 안해도 됨
//static을 쓰면 객체가 수행하는 것이 아니라 function으로 작동

class Sample2{
	//static이 붙어있으면 객체를 만들지 않고 설계도 상태로 사용하는 것
	int n_field;
	static int s_field;
	static void Test() {
		System.out.println("다른 클래스 내의 test 실행");
		}//static으로 선언된 메서드는 객체없이 클래스만으로 동작 가능
		 //설계도가 하는 동작으로 객체와는 무관하다.
}

//static으로 선언된 변수는 객체없이 클래스만으로 동작 가능하며 객체를 통해 접근하더라도 겍체와는 아무 상관이 없다.
//의도적으로 static을 쓰는 경우가 데이터 회선을 의도적으로 1개로 할 때 사용
//Java에서는 static 사용을 자제하는 것이 바람직. 원래 타언어 사용자의 편의를 위해 만든 것

