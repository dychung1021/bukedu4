package Inter;

public class Sample1 {
	public static void main(String[] args) {
		Child c=new Child();
		Parent p=new Child();
//		ITF i=new Child();
//		INTER in=new Child();
//		ITF i = new ITF();//생성자가 없으므로 성립하지 않음
		ITF i = new Child();//생성자가 없으므로 동작은 없지만 용도에 따른 지정은 가능 
		System.out.println(i.a);
	}//main
}//sample1
//인터페이스 : 사용설명서 
//interface 이름{} 클래스가 아님(필드 없고, 생성자 없고, 매서드 없고)
//interface는 객체를 만들 수 없다.
interface ITF{
//	ITF(){}; 객체가 아니므로 No필드 No생성자 No메서드
	public static final int a=10;//상수임 int a=10;로 축약표기 가능
	void run();//추상메서드는 가질 수 있다.{}가 없는 
}
//클래스에 해당 용도를 구현해서 사용
//추상메서드를 가질 수 있다.
interface INTER{
	
	
}
abstract class Parent{
	
}

//class Child extends Parent implements ITF, INTER{
//	public void run() {}//interface는 public으로 구현되어 있으므로 추상 메서드 구체화시 public 반드시 붙여줘야
//}

class Child extends Parent implements ITF, INTER{
	// interface 된 클래스가 추상클래스인 경우 구체화 안해도 됨
}
