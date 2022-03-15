package g.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbEx10 {
	
	public static char checkGrade(double avg) {
		
		char grade=' ';
		if(avg<=100 && avg>=90) {
			grade='A';			
		}else if(avg<90 && avg>=80) {
			grade='B';
		}else if(avg<80 && avg>=70) {
			grade='C';
		}else if(avg<70 && avg>=60) {
			grade='D';
		}else if(avg<60 && avg>=0) {
			grade='F';
		}
		
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stdNum=" ";
		int kor=0;
		int math=0;
		int eng=0;
		int java=0;
		int sum=0;
		double avg=0;
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("학번을 입력하세요.");
		stdNum=keyboard.nextLine();
		System.out.println("국어 성적을 입력하세요.");
		kor=keyboard.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		math=keyboard.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		eng=keyboard.nextInt();
		System.out.println("자바 성적을 입력하세요.");
		java=keyboard.nextInt();
		
		keyboard.close();
		System.out.println(" ");
		
		BufferedWriter bw=null;
		
		try{
		bw=new BufferedWriter(new FileWriter("files\\grade.txt"));
	
		bw.write("----------------------------"+"\n");
		bw.write("학번 : "+stdNum+"\n");
		bw.write("----------------------------"+"\n");
		bw.write("국어 : "+kor+"\n");
		bw.write("수학 : "+math+"\n");
		bw.write("영어 : "+eng+"\n");
		bw.write("자바 : "+java+"\n");
		bw.write("----------------------------"+"\n");
		sum=(kor+math+eng+java);
		bw.write("총점 : "+sum+"\n");
		avg=(double)sum/4;
		bw.write("평균 : "+avg+"\n");
		bw.write("학점 : "+checkGrade(avg)+"\n");
		bw.write("----------------------------");
		
		bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw!=null) {
					bw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
