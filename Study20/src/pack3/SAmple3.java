package pack3;
import java.util.function.*;
public class SAmple3 {
	public static void main(String[] args) {
		//객체를 만들어서 상품명이나 가격을 입력한 뒤
		//객체의 show를 실행해서 출력하시오
		
		Product a = new Product();
		a.setName("단팥빵  ");
		a.setPrice(2000);
		System.out.println(a.getName());

}//main
}//class
class Product{
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name=name;
		
	}//이름 데이터를 적어주는 것 setName
	
	public String getName() {
		return name;
	}//이름 데이터를 가져 오는 것 String getName
	
	void setPrice(int price) {
		if(price<0) {
			System.out.println("잘못된 물건값을 입력했습니다. 0으로 초기화 합니다");
		}//if
		else {
			this.price=price;
			}//else
		
	}//void setPrice
	
	void show() {
		System.out.println("상품명"+name+","+"가격"+price);
	}//void show
}//class Product
