package e.api;

/*
���ڿ����� Ư�� ���ڸ� ������ ���ڷ� �����ϴ� myReplace method
ù��° �Ű������� ��������� �Ǵ� ���ڿ�, �ι�°�� ���ڿ� ���� �����ϴ� ����,
����°�� �����ϰ��� �ϴ� ����
�������� �Ǵ� ���ڰ� ������� ���� ���� �״�� ����
*/

public class ProbEx06{

	public static String myReplace(String str, char oldChar, char newChar){
		
		
		char[] ex=str.toCharArray();
		
		for(int k=1; k<str.length(); k++) {
			
			if(ex[k]==oldChar) {	
			    ex[k]=newChar;
			}
		}
		
		str=String.valueOf(ex);

		return str;
	}

	public static void main(String[] args) {

		System.out.println("���ڿ��� Ư������ �����ϴ� �׽�Ʈ");
		System.out.println("--------------sample1-------------");
		String str1=myReplace("hello world",'l','*');
		System.out.println(str1);

		System.out.println("--------------sample2-------------");
		String str2=myReplace("hello world",' ','-');
		System.out.println(str2);

		System.out.println("--------------sample3-------------");
		String str3=myReplace("hello world",'a','*');
		System.out.println(str3);
		
	}
}
