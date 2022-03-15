package g.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Vector;

public class ProbEx06 {			
	
    public Vector<Score> getScore(String fileName) throws Exception {
    	
    	BufferedReader br=new BufferedReader(new FileReader(fileName));
    	
    	String str=" ";
    	Vector<Score> vec=new Vector<Score>();
    	
   
			while((str=br.readLine())!=null) {
				
				String[] arrStr=str.split("/");

			    String name=arrStr[0];
			    int kor=Integer.parseInt(arrStr[1]);
			    int eng=Integer.parseInt(arrStr[2]);
			    int math=Integer.parseInt(arrStr[3]);
			    int sum=kor+eng+math;
			    
			    Score score=new Score(name, kor, eng, math, sum);
			    
			    vec.add(score);
			
			}

			br.close();
			return vec;
			
    	
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ProbEx06 p2=new ProbEx06();
		Vector<Score> scores = p2.getScore("src/data.txt");
		
		for(int i=0; i<scores.size(); i++) {
			Score score= scores.get(i);
			System.out.println(score.getName()+":"+ score.getKor()+" "+score.getEng()+" " +score.getMath()+" "+score.getSum());
		}

	}
}

class Score{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	public Score() {
	}
	
	public Score(String name, int kor, int eng, int math, int sum) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}

