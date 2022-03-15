package b.method;

/*���ڿ� ����� char�迭�� �����ϴ� �޼ҵ�
���ڸ� ����Ű�� �ε���(start, end)�� 0���� �����Ѵ�
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
