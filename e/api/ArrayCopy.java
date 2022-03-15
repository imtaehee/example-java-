package e.api;

//입력받는 배열의 값들을 순서대로 뒤집어 Vector에 담는 함수를 작성

import java.util.Vector;

public class ArrayCopy {
	
	public Vector<String> moveToVector(String[] datas){
			
		Vector<String> vector= new  Vector<String>();
		
		for(int i=datas.length-1; i>=0; i--) {
			
			vector.add(datas[i]);
			
		}
		return vector;
	}

	public static void main(String args[]) {
		
		ArrayCopy ac=new ArrayCopy();
		String datas[]= {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));		
	}

}