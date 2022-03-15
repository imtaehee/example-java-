package g.io;

//list.txt 파일의 내용을 읽어서 "수료"인지 "미수료"인지 출력

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class ProbEx07 {
	
	public Vector<String> getList() {
		
		BufferedReader br=null;
		Vector<String> vec=new Vector<String>();
		
		try {
			
			br=new BufferedReader(new FileReader("files\\list.txt"));
		
		String str=" ";
		String result="미수료";
		
	   while((str=br.readLine())!=null) {
		   String[] arrStr=str.split("/");
		   
		   if(arrStr[1].equalsIgnoreCase("JAVA")) {
			   if(Integer.parseInt(arrStr[2])>=80) {
				   result="수료";
			   }
		   }else if(arrStr[1].equalsIgnoreCase("SQL")) {
			   if(Integer.parseInt(arrStr[2])>=90) {
				   result="수료";
			   }
		   }
		   
		  vec.add("["+arrStr[0]+", "+arrStr[1]+", "+arrStr[2]+", "+result+"]");
	   }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br != null) {
		
		    try{
		    	br.close();
		    }catch(Exception e) {}
		    }
		}
		
		return vec;
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ProbEx07 e=new ProbEx07();
		Vector<String> scores=e.getList();
		for(int i=0; i<scores.size(); i++	) {
			System.out.println(scores.get(i));
		}
	}

}
