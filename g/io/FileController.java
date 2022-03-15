package g.io;

import java.io.*;
import java.util.*;


//String Ÿ���� �ؽ�Ʈ���� ���ϸ��� �Է¹޾� �ؽ�Ʈ�� ���μ����� �ݴ�� �Ͽ� 
//�ι�° ������ ����� String Ÿ���� �ؽ�Ʈ ���ϸ����� ����

public class FileController {
	
	public void reverseLine(String oldf, String newf) throws Exception{
		
		BufferedReader br=null;
		BufferedWriter bw=null;
		List<String> bwList=new ArrayList<String>();
		
		br=new BufferedReader(new FileReader(oldf));
		bw=new BufferedWriter(new FileWriter(newf));
		
		StringBuffer sb=new StringBuffer();

		String source=" ";
		while((source=br.readLine())!=null){
			bwList.add(source);
		}
		//System.out.println(bwList);
		
		for(int i=bwList.size()-1;i>=0; i--) {
			sb.append(bwList.get(i)+"\n");
		}
		//System.out.println(sb);
		
		bw.write(sb.toString());
		bw.flush();
		
		bw.close();
		br.close();		
		}


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileController c=new FileController();
		String oldf="files/oldf.txt";
		String newf="files/newf.txt";
		c.reverseLine(oldf,newf);

	}

}
