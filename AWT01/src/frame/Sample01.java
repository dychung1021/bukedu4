package frame;
import java.awt.*;
import java.awt.event.*;
public class Sample01 extends Frame{
	Sample01(){
//		setTitle("화면만들기");				//Frame으로부터 상속받은 setTitle활용 
		super("이 것도 가능");				//위의 코드와 동일 즉 Frame의 메서드를 사용
		Button b=new Button("click"); 	//버튼 객체, Component
		b.setBounds(100,40,100,60);		//크기위치 조절(x좌표 y좌표, 너비, 높이)
//		객체.addActionListener 해당객체가 특정동작에 반응하도록 설정
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭이 수행되었습니다");
			}//actionPerformed
			
		}//b.addActionListener
		);
		add(b);							//생성된 Component객체를 Container에 연결하는 메서드
		setSize(300,300);				//창 크기조절(가로, 세로)
		setLayout(null); 				//화면배치규칙
		setVisible(true);				//화면이 눈에 보이는 설정
	}//Sample01
	public static void main(String[] args) {
		new Sample01();
	}

}
//Frame : 윈도우 창,가장 큰 Container
//Component:레이아웃에 배치될 수 있는 요소, 버튼, 문자, 그림 등등
//Container: 요소들을 감쌀 수 있는 가상의 상자 <div>와 유사한 개념, Container 안에 Container를 넣을 수 있음
//Panel : Container 내부에 배치되는 Conatainer, Container이자 Component 역할 수행
//Layout: 화면배치규칙, 무규칙일 경우에만 자유배치가능