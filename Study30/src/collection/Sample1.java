package collection;
	import java.util.*;
	
public class Sample1 {
	public static void main(String[] args) {
	// 리스트 : 순서가 엄격하게 부여된 집합 데이터, 순번(index)이 검색의 기준점이다
	//        기준점이 존재하므로 중복 데이터를 허용
	// java collection은 interface이기 때문에 직접 객체로 제작할 수 없고
	// implements로 되어있는 class를 객체로 조립하여 사용
		
	//	List L = new List(); 이렇게 사용할 수 없다. 
		List<String> L = new ArrayList<String>(); // ArrayList는 class임
		System.out.println(L);
		L.add("홍길동");
		System.out.println(L);
		L.add("이영준");
		System.out.println(L);
		L.add("김철수");
		System.out.println(L);
		L.add(1,"김붑붑");//1의 자리에 김붑붑을 추가
		System.out.println(L);
		
		List<String> L2 = new ArrayList<String>();
		L2.add("A");
		L2.add("B");
		L2.add("C");
		System.out.println(L);
		System.out.println(L2);
		
		L.addAll(2,L2);//리스트를 다른 리스트와 합치는 명령은 addAll
		System.out.println(L);
//		L.add(L2);

		System.out.println(L);
		//데이터를 입력할 때는 add()로 입력하고 꺼내올 때는 get()으로 가져온다.
		//리스트에서 데이터의 수를 확인할 때는 length가 아니고 size()를 사용한다.
		//일반 for 문
		for (int i=0;i<L.size();i++) {
			System.out.print(L.get(i)+"\t");
		}
		//향상된 for 문
		// for(변수:집합){집합운행시 1 단위마다 수행할 문장;}

		System.out.println();
		for (String str:L) {
			System.out.print(str+"\t");
		}
}
}
	
