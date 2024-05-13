package pack1;

public class Data {
	//접근제한자 : 소스코드의 위치를 기준으로 해당 데이터에 접근여부를 결정하는 단어 ****
	private int pri; //해당 클래스 내부에서만 사용가능
	protected int pro;//package 또는 상속관계에서 사용가능 
	int def;//default//같은 package에서만 사용가능
	public int pub;//전체공개****
}
