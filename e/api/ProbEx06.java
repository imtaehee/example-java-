package e.api;

/*
문자열내의 특정 문자를 지정한 문자로 수정하는 myReplace method
첫번째 매개변수는 수정대상이 되는 문자열, 두번째는 문자열 내에 존재하는 문자,
세번째는 변경하고자 하는 문자
변경대상이 되는 문자가 없을경우 변경 없이 그대로 리턴
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

		System.out.println("문자열에 특정문자 변경하는 테스트");
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
