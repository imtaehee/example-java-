package e.api;

//주어진 문자열 배열을 역순으로 출력하되 각 문자열 또한 역순으로 변환 출력

import java.util.Vector;
import java.util.Stack;

public class ProbEx10 {
	
	public Vector<String> dataChange(String[] strData){
		
		Vector <String> vec= new Vector <String>();
		Stack<String>  stack=new Stack <String>();
		String str=" ";
	
		for(int i=0; i<strData.length; i++) {
			for(int k=0; k<strData[i].length(); k++) {
			    stack.push(String.valueOf(strData[i].charAt(k)));
			}
		}
		//System.out.println(stack);
	
		for(int j=strData.length-1; j>=0; j--) {
			for(int k=strData[j].length()-1;k>=0;k--) {
				str+=stack.pop();
			}
			vec.add(str);
			str=" ";
		}
		//System.out.println(vec);
	
		return vec;
	}
	
	public static void main(String[] args) {
		
		ProbEx10 st=new ProbEx10();
		String[] strData = {"Java Programming", "JDBC","Oracle10g", "JSP/Servlet"};
		Vector <String> v= st.dataChange(strData);
		
		for(int i=0; i<v.size(); i++) {
	    	System.out.println(v.elementAt(i));
		}
		
		//for(Object obj: v){
		//	System.out.print(obj);
		//}
		}
}
