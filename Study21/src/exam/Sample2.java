package exam;
import java.util.*;
public class Sample2 {
	public static void main(String[] args) {
		Student aa=new Student("홍길동");
		Student bb=new Student("홍길동",55,89,90);
//		String input;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("이름을 입력해 주세요");
//		input =sc.toString();
		System.out.println(aa.name);
		System.out.println("이   름 : "+bb.name);
		System.out.println("수학점수 : "+bb.Math_Score);
		System.out.println("영어점수 : "+bb.Eng_Score);
		System.out.println("국어점수 : "+bb.Kor_Score);
		
//		bb.out(bb.name,bb.Math_Score,bb.Eng_Score,bb.Kor_Score);
		bb.out();
		System.out.println(bb);
		System.out.println(aa);
	}

}
class Student{
	String name;
	int Math_Score;
	int Eng_Score;
	int Kor_Score;

	//생성자는 리턴타입이 적혀있지 않고 이름이 클래스와 똑같다. 
	//생성자는 객체가 조립될 때 단 한번 무조건 실행된다.
	//객체를 만들 때는 생성자 중 하나만 선택해서 조립하게 된다.
	Student(String str){
		name=str;
	}
	Student(String a, int b, int c, int d){
		name=a;
		Math_Score=b;
		Eng_Score=c;
		Kor_Score=d;
	}
//	void out(String a, int b, int c, int d){
	void out(){
		System.out.println(name);
		System.out.println("이   름 : "+name);
		System.out.println("수학점수 : "+Math_Score);
		System.out.println("영어점수 : "+Eng_Score);
		System.out.println("국어점수 : "+Kor_Score);
	}
	//오버라이드 : 기존에 있던 기능을 재정의해서 사용하는 기법
	//클래스 내부에 toString()을 재정의하면 객체를 출력시 주소가 아니라 해당 내용을 출력한다
	public String toString() {
		return ("이   름 : "+name+"수학점수 : "+Math_Score+"영어점수 : "+Eng_Score+"국어점수 : "+Kor_Score);
	}
}
//이름과 수학성적, 영어성적, 국어성적을 가질 수 있는 학생객체를 만들려고 한다.
//Student클래스를 제작하여 필드를 작성하시오
//생성자를 이용하여 이름을 입력할 수 있도록 마련하시오.
//다른 생성자를 통해 이름, 수학점수, 영어점수, 국어점수를 한꺼번에 받을수 있도록
//다른 생성자를 하나 더 작성하시오.
//메서드를 작성해서 학생객체가 본인이 가지고 있는 점수와 이름을 출력하도록 제작하시오