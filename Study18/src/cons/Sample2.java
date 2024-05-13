package cons;

public class Sample2 {
	public static void main(String[] args) {
		Test a;
		a=new Test("홍길동");
		//a.name="홍길동";
		System.out.println(a.name);
		Test b;
		b=new Test(1);
		//b.name="홍길동";
		System.out.println(b.name);
		
	}
	//클래스는 필드, 메서드, 생성자를 가질수 있다.

}
class Test{
	//생성자 : 객체를 생성하는 동작
	//생성자는 따로 제작하지 않아도 클래스 내부에 자동으로 만들어져 있다.
	// a=new Test(); 에서 Test()가 생성자임.
	// 생성자를 통해 다른 동작을 수행해야 한다면 별도로 생성자를 만들어 주어야 한다.
	// 클래스 명(){객체 생성시 수행할 동작;}
	// 생성자는 객체 생성시 무조건 "단 한번" 실행된다.
	// 초기값 지정에 매우 유용
	String name;
	Test(String str){
		//조립하는 기능은 기본적으로 들어가 있다. 눈에는 보이지 않지만...
		System.out.println("나무 책상 조립");
		name=str;
	}//Test의 생성자
	Test(int a){
		//조립하는 기능은 기본적으로 들어가 있다. 눈에는 보이지 않지만...
		System.out.println(a+" 개 철제 책상 조립");
		name="하이퍼 데스크";
	}//Test의 생성자이지만 다른 방법(이름은 클래스 이름으로만 만들어야 하므로 매개변수를 바꾸어 override
}

