package cls;

public class Sample2 {
	public static void main(String[] args) {
		Phone i=new Phone();
		i.name="아이폰";
		Phone g=new Phone();
		g.name="갤럭시";
		//인스턴스 변수는 인스턴스를 거친 오브젝트를 통하지 않으면 접근할 수 없다.
		//클래스는 설계도이므로 조립하지 않으면 사용할 수 없고
		//클래스 내부에 만들어진 변수도 아직 조립되지 않은 것이라 조립 전에는 사용할 수 없다.
		//만들어진 객체는 다른 객체에 영향을 미치지 않는다
		System.out.println(i.name);
		System.out.println(g.name);
		
		Commodity p1=new Commodity();
		Commodity p2=new Commodity();
		p1.name="걸상";
		System.out.println(p1.price);
		System.out.println(p2.sale);
		// "nothing" is presented as null for String, 0 for number, false for boolean 
		//클래스는 설계도다.
		//클래스는 필드, 메서드, 생성자를 포함할 수 있다.
		//필드는 클래스 내부에 작성되어 조립된 객체가 가지는 속성을 저장할 수 있는 공간
		
	}//main
}//class Sample2
	class Phone{
		String os;
		String name;
		String number;
		int battery;

}//class Phone

	

	class Commodity{
		String name;
		String category;//분류
		String vendor;//판매자
		String remark;//상품설명
		String[] img;//상품사진, 배열도 가능하고 객체를 필드로 이용할 수도 있다.
		boolean sale;//bargain sale 여부
		boolean fragile;//파손여부
		boolean delivery;//냉동여부
		int price;
		int inventory;//재고여부
		
	class Shop{
		Commodity[] products;
	}
	


}//class Phone