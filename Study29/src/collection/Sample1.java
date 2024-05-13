package collection;
import java.util.*;
public class Sample1 {
	public static void main(String[] args) {
	// collection
	// 자료구조에 이용할 수 있는 일정의 프레임워크 사용방법이 정해져 있음.
	// interface 로 만들어져 있음. 메서드, 필드, 생성자 없음. 객체로 조립되지 않으며 추상메서드는 있다.
	// java collection의 종류
		// Stack : last in first out 후입선출( 검색이 어려움)
		// List : 순서가 엄격히 존재하는 자료형, index가 검색의 기준이자 순서. 검색이 용이하나 입력에 시간이 걸림
			// Vector, Stack, LinkedList, *ArrayList가 있음.
		// Set  : 순서가 존재하지 않는 자료형, 자료의 구별이 불가능하기 때문에 중복데이터를 허락하지 않음
			// *HashSet, SortedSet, TreeSet등이 있다.
		// Map : 겅색어와 데이터가 한 쌍으로 이루어진 자료형, 데이터는 중복이 가능하지만 검색어는 중복이 불가능
			// *HashMap, SortedMap, TreeMap 등이 있다.
		
	// java collection은 interface로 구성되어 있어 바로 객체로 조립하여 사용할 수 없다. 다음 문장은 오류
//		List = new List();
		List L = new ArrayList();
		//collection은 interface라서 collection이 구현된 클래스를 이용해서 객체를 만들어야 한다.
		//List.add(자료) : 해당 자료를 리스트에 추가함. 가장 마지막 번호에 추가됨.
		//List.add(index, 자료) : 해당 index에 자료를 추가하고 뒤 자료부터는 하나씩 index가 밀림
		//List.get(index) : index에 해당하는 자료를 확인.
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(3);
		L.add("A");
		L.add(2,"B");
		System.out.println(L);
		System.out.println(L.size());
		//리스트는 배열과 달리 size() 메서드로 크기를 확인해야 한다. .length를 사용할 수 없다.

		System.out.println(L.get(0));
	}//main
}//sample1
