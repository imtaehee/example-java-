package g.io;

import java.io.*;
//import java.util.*;

//String 타입의 텍스트 포맷 파일명을 입력받아 파일에 있는 내용의 총점과 평균을 출력

public class Grade {
	
	public void printGrade(String fileName) throws Exception {
		
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		
		String oneLine=" ";
		int sum=0;
		int count=0;
		double avg=0;
		
		//List <String> brList= new ArrayList<String>();
		
		while((oneLine=br.readLine())!=null) {
			String[] str=oneLine.split(",");
			
			System.out.println(str[0]+"의 점수는 "+str[1]+"점 입니다.");
			sum += Integer.parseInt(str[1]);
			count++;
			
			//brList.add(oneLine);
		}
		avg=sum/count;
		System.out.println("모두의 총점은 "+sum+"점 입니다.");
		System.out.println("모두의 평균은 "+avg+"점 입니다.");
		
		//for(int i=0; i<brList.size(); i++) {
		//    String[] str=brList.get(i).split(",");
		//    System.out.println(str[i]);
		//}
		br.close();
		
		
	}


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Grade grade=new Grade();
		String fileName="score.txt";
		grade.printGrade(fileName);

	}

}
