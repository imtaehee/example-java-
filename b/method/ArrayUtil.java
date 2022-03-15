package b.method;

/*문자열 뒤집어서 char배열로 리턴하는 메소드
문자를 가리키는 인덱스(start, end)는 0부터 시작한다
*/
import java.util.Stack;

public class ArrayUtil{

	public char[] reverseString(char[] s,int start, int end){
		
		char[] ex=new char[s.length];	
		Stack <Character> stack=new Stack<Character>();
				
		for(int k=0; k<s.length; k++) {
			ex[k]=s[k];
		}
	
		for(int k=start; k<=end; k++) {
			stack.push(s[k]);		
		}
		for(int k=start; k<=end;k++) {
			ex[k]=(stack.pop());			
		}
		
		return ex;
				
	}

	public static void main(String[] args) {
		ArrayUtil au=new ArrayUtil();
		char[] s={'J','a','v','a','P','r','o','g','r','a','m'};
		System.out.println(au.reverseString(s,0,3));
		System.out.println(au.reverseString(s,4,7));
		System.out.println(au.reverseString(s,8,10));
		System.out.println(au.reverseString(s,0,10));
				
	}
}
