package conn;
import java.sql.*;//sql을 이용할 때 필요한 데이터 규격들이 들어 있어요
public class Sample1 {
	public static void main(String[] args) {
		//jdbc가 있어야 데이터베이스와 통신이 가능하다.
		Connection conn;	//접속회선
		Statement stmt;		//쿼리문을 전송하기 위한 규격
		ResultSet rs;		//Select문의 결과를 받아오기 위한 규격
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";//접속위치 db 이름 지정해야 함.
		String db_id="root";//별도의 id를 받아 놓지 않았으므로 최상위 
		String db_pw="iotiot";
		String sql="select * from student where name like '홍__'";
		
		
		try {
			conn=DriverManager.getConnection(url,db_id,db_pw);//회선을 가져옴.
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("접속 이상없음!");
//			System.out.println(rs);
			
			while(rs.next()){
				//rs.next(); 한줄의 데이터를 읽어 오는 명령어, 이것을 수행해야 getInt getString이 작동
				//rs.next()는 다음 행에 data가 있는지 없는지를 boolean값으로 반환
					String num=rs.getString(1);//resultSet에서는 1부터 indexing
					String name=rs.getString(2);
					String kor=rs.getString(3);
					String math=rs.getString(4);
					String eng=rs.getString(5);
					String sum=rs.getString(6);
				System.out.println(num+" \t"+name+"\t "+kor+"\t "+math+"\t "+eng+"\t "+sum);
				};
		
		}catch(Exception e) {
			System.out.println("접속 중 오류 발생 :" +e);
	}

}
}
