package g.io;

import java.io.*;

public class FileCalculator {
	
	public void addCalculateResult(String inputFileName) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(inputFileName));
		BufferedWriter bw=new BufferedWriter(new FileWriter(inputFileName,true));
		
		String str=" ";
		int i=0;
		int k=1;
		
		while((str=br.readLine()) !=null) {
				
			i += Integer.parseInt(str);
			k *= Integer.parseInt(str);
		}
		bw.newLine();
		bw.write(Integer.toString(i)+"\n");
		bw.write(Integer.toString(k));
		
		bw.flush();

		bw.close();
		br.close();
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileCalculator fc=new FileCalculator();
		fc.addCalculateResult("D:\\test.txt");

	}

}
