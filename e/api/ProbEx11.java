package e.api;
/*
인코딩 규칙 : 인자로 받은 문자열이 영문자 대소문자이거나 숫자인 경우에는 그대로 리턴
한글이면 16진수 값으로 변환 후 변환된 값 앞에 '%' 기호 추가

16진수로 변환된 값이 ffffffb4일 경우 7,8번 자리의 문자 "b4"만 대문자로 변환되어 결과
*/


public class ProbEx11 {
	public String toEndcoding(String str) {
		
		/*
        String hexStr=" ";
        byte[] tempArr=str.getBytes();

        for(int i=0; i<tempArr.length; i++) {
        	byte tempByte=tempArr[i];
        	
        	if(tempByte>='A' && tempByte<='z'){
        		hexStr+=String.valueOf((char)tempByte);
        		
        	}else if(tempByte>=48 && tempByte<=58) {
        		hexStr+=String.valueOf((char)tempByte);
        		
        	}else if(tempByte==' ') {
        		hexStr +=" ";
        		
        	}else {
        		hexStr += "%"+Integer.toHexString(tempByte).substring(6).toUpperCase();
        	}	
        }
        */
		///*
        String hexStr=" ";
        byte[] tempArr=str.getBytes();
        
        for(int i=0; i<tempArr.length; i++) {
        	byte tempByte=tempArr[i];
        	
        	if(tempByte>='A' && tempByte<='z' || tempByte>=48 && tempByte<=58){
        		hexStr +=String.valueOf((char)tempByte);
        	}else if(tempByte==' ') {
        		hexStr += " ";
        	}else {
        		hexStr += "%"+Integer.toHexString(tempByte).substring(6).toUpperCase();
        	}
        
        }
       //*/
		return hexStr;
	}
	
	public static void main(String[] args) {
		ProbEx11 p1=new ProbEx11();
		System.out.println("입력:Korea");
		System.out.println("출력:"+p1.toEndcoding("Korea"));
		System.out.println("입력:홍길동");
		System.out.println("출력:"+p1.toEndcoding("홍길동"));
		System.out.println("입력:홍 길 동");
		System.out.println("출력:"+p1.toEndcoding("홍 길 동"));
		System.out.println("입력:Hong 길 동");
		System.out.println("출력:"+p1.toEndcoding("Hong 길 동"));
		System.out.println("입력:0319");
		System.out.println("출력:"+p1.toEndcoding("0319"));
	}

}
