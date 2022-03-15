package g.io;

import java.io.*;

//String 타입 텍스트 포맷 파일명 2개를 입력받아 두 텍스트 파일의 내용을 라인별로 비교하고
//차이점이 있는 경우 해당 라인들은 ArrayList에 담아 리턴

import java.util.*;

public class FileCompareUtil {
	
	public ArrayList<String> compareFile(String fstFileName, String scdFileName) throws Exception{
		
		BufferedReader br1=new BufferedReader(new FileReader(fstFileName));
		BufferedReader br2=new BufferedReader(new FileReader(scdFileName));
		
		List <String> brList1= new ArrayList<String>();
		List <String> brList2= new ArrayList<String>();
		
		ArrayList <String> brList= new ArrayList<String>();
		
		String source1=" ";
		String source2=" ";
		
		/*
		while((source1=br1.readLine())!=null) {
			source2=br2.readLine();
			if(source1.equals(source2)) {
				bool=false;
			}else {
				bool=true;
			}
			if(bool) {
				
			}
		}
		*/		
		
		while((source1=br1.readLine())!=null) {
			brList1.add(source1);			
		}
		while((source2=br2.readLine())!=null) {
			brList2.add(source2);			
		}
		br1.close();
		br2.close();
		
		for(int k=0; k<brList1.size(); k++) {
			if(!(brList1.get(k)).equals(brList2.get(k))) {
				
				brList.add("Line "+(k+1)+":"+brList1.get(k)+"\n");
			}
		}
		
		return brList;

	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileCompareUtil util=new FileCompareUtil();
		
		System.out.println(util.compareFile("./files/fstFile1.txt","./files/scdFile1.txt"));
		System.out.println("Successful!!!");

	}

}
