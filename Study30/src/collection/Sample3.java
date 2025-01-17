package collection;
import java.util.*;
public class Sample3 {
	public static void main(String[] args) {
		//Set : 순서가 없는 데이터 집합, 데이터의 중복을 허용하지 않는다.
		//Set 역시 interface이므로 implements가 된 class로 이용해야 한다
		HashSet<String> s = new HashSet<String>(); 
		boolean result;
		s.add("apple");
		s.add("mango");
		s.add("grape");
		s.add("orange");
		result = s.add("apple");
		System.out.println(result);//새로운 데이터가 잘 들어가면 true 반환
		System.out.println(s);
		s.add("apple");
		s.add(null);
		s.add("null");//string null과 data null이 사람은 구별이 안되므로 문자열 null은 입력하지 않도록 한다.
		System.out.println(s);//순서가 없기 때문에 컴퓨터마다 다른 순서가 나올 수 있다. but 속도가 매우 빠르다. 
		result=s.add("bear");
		System.out.println(result);//새로운 데이터가 잘 들어가면 true 반환
		System.out.println(s);//새로운 데이터가 잘 들어가면 true 반환

		// set의  for 문을 통한 운행, 일반적인 방법으로는 불가능
		//배열로 변경해서 for 문으로 출력하는 방법

		System.out.println();
		System.out.println("<배열로 변경해서 for 문으로 출력하는 방법>");
		String[] array = new String[s.size()]; //set과 동일한 크기의 배열을 준비
		s.toArray(array);                      //set과 내용물을 배열로 옮겨적기(index가 부여됨)
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		// List로 변환해서 for문으로 출력

		System.out.println();
		System.out.println("<List로 변환해서 for문으로 출력>");
		List<String> L=new ArrayList<String>(s); //생성자를 통해 set데이터를 전달해서 list제작
//		System.out.println(L);
		for(int i=0; i<L.size();i++) {
			System.out.println(L.get(i));
		}
		
		//향상된 for 문을 이용하는 방법, set 데이터도 iterator가 존재하므로 향상된  for문 사용가능

		System.out.println();
		System.out.println("<향상된 for 문을 이용하는 방법>");
		for(String str:s) {
			System.out.println(str);
		}

		System.out.println();
		System.out.println("<iterator를 이용해서 출력하는 방법>");
		// iterator를 이용해서 출력하는 방법, iterator는 hasNext() 값이 자신의 위치에서 다음에 데이터가 있으면 true 없으면 false 
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
