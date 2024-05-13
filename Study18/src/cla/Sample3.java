package cla;

public class Sample3 {
	public static void main(String[] args) {
		Client c=new Client();
		c.id="test";
		c.pw="1111";
		c.name="홍길동";
		String msg = "이것도 영화라고 만들었냐";
		int score=1;
		int number=44567;//영화고유 일련번호
		
		String data = c.datgul(msg,score,number);

		System.out.println("데이터베이스에 "+ data + "를 입력했습니다.");
		

		data = c.datgul(score, msg, number);//같은 이름이라도 매개변수의 type, 위치가 다르면 그것에 맞는 메서드 동작
	}//main

}//Sample3

class Client{
	String id;
	String pw;
	String name;
	String datgul(String dat, int star, int number){//댓글내용과 별점 수
		System.out.println("다음 영화에 댓글이 달렸습니다"+number);
		System.out.println("글쓴이 : "+id +"댓글내용 : "+dat+" 평점 : "+star);
		return(dat+", "+star);
	}
	String datgul(int star, String dat,  int number){//매개변수의 순서를 바꾸어 
		System.out.println("다음 음식점에 댓글이 달렸습니다"+number);
		System.out.println(star+"글쓴이 : "+id +"댓글내용 : "+dat+" 평점 : ");
		return(star+", "+dat);
	}
}
