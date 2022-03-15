package g.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Random;
import java.util.Set;

public class ProbEx08 {
	
	public static int[] generateRandomNumber() {
		//10개의 중복되지 않는 난수를 생성하여 배열에 저장한후 리턴
		
		Random random=new Random();
		Set<Integer> set=new HashSet<Integer>();
		
		while(set.size()<10) {
			int i=random.nextInt(21);
			set.add(i);
		}
		
		//List<Integer> list=new ArrayList<Integer>(set);
		int[] number=new int[set.size()];
		
		//for(int i=0; i<list.size(); i++) {
		//	number[i]=list.get(i);
		//}
		
		int i=0;
		for(int num : set) {
			number[i++]=num;
		}
		
		return number;
		
	}
	public static void printStatistics(int[] array) {
		//10개의 난수 배열을 매개변수로 하여 발생된 난수와 통계정보를 store.txt 파일에 출력
		
		BufferedWriter bw=null;
		try {
		bw=new BufferedWriter(new FileWriter("files\\store.txt"));
		
		int max=array[0];
		int min=array[0];
		int sum=0;
		
		String str=" ";
		
		for(int i=0; i<array.length; i++) {
			str=array[i]+" ";
			bw.write(str);
			bw.newLine();
			
			sum += array[i];
			
		    if(max<array[i]) {
		    	max=array[i];
		    }
		    if(min>array[i]) {
		    	min=array[i];
		    }
		}
		double avg= sum/array.length;
		
		bw.write("최대값 : "+max+"\n");
		bw.write("최소값 : "+min+"\n");
		bw.write("평균값 : "+avg);
		
		bw.flush();
		bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=generateRandomNumber();
		printStatistics(array);

	}

}
