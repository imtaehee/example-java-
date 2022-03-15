package g.io;

//파일 내용 화면에 출력하는 fileToPring method
//전달받은 문자열 address에 해당하는 지역정보 갖는 고객정보 읽고, 
//USER인스턴스 생성 후 VECTOR에 저장 리턴

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class FileUtil {
	
	public static void fileToPrint(String fileName) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader("src\\data.txt"));
		
		String str=" ";
		//StringBuffer sb=new StringBuffer();
		while((str=br.readLine())!=null) {
			//sb.append(str);
			System.out.println(str);
		}
		br.close();
	}
	
	public static Vector<User> fileFindAddress(String fileName, String address) throws Exception{
		
        BufferedReader br=new BufferedReader(new FileReader("src\\data.txt"));
		
		String source=" ";
		String[] arrStr=null;
		Vector<User> vec=new  Vector<User>();
		
		while((source=br.readLine())!=null) {
			arrStr=source.split("/");
			
			if(arrStr[1].equals(address)) {
			
			String name=arrStr[0];
			String add=arrStr[1];
			String cellularNumber=arrStr[2];
			boolean male=arrStr[3].equals("남");
			
			User user=new User(name, add, cellularNumber, male);
			
			vec.add(user);
			}
		}
		br.close();
		
		return vec;
		
	}
}