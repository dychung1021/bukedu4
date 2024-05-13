package tc;
import java.util.Scanner;
public class Sample1 {
	public static void main(String[] args) {
			// try-catch : 오류 발생시 해당 오류를 특수처리하여 다른 기능이 동작하도록 하는 문법
			// try{오류가 발행할 수 있는 문장;} catch (매개변수){특수처리의 내용;}
			// connection(회선) 처리에서는 반드시 사용해야 함
			// 공부할 때는 index 범위오류, Scanner의 데이터타입오류 등에 사용
		System.out.println("작업을 시작합니다.");
		int[] arr=new int[3];
		try {
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		
		arr[3]=3;}
//		catch(Exception e) {
		catch(ArrayIndexOutOfBoundsException e) {//이것이 정석이지만 오류 종류예상이 되지 않을 때 위의 Exception만 써도 됨
			e.printStackTrace();//실제로는 잘 사용하지 않음.
			System.out.println("오류발생 "+e);
		}
		System.out.println("모든 작업이 오류없이 진행되었습니다");
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("반드시 숫자를 입력해 주세요");
		try {
		i=sc.nextInt();
	}catch(Exception e){
		System.out.println("문자 적으면 동작 안합니다"+e);
}
	}
}