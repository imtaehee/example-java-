package e.api;

import java.util.*;

public class ProbEx12 {
	private static String getParameter(String url, String paramName) {
		
		Map<String,String> map=new Hashtable<String,String>();
		
		//String key=" ";
		String value=" ";
		
		int idx=url.indexOf("?");
		String url1=url.substring(idx+1);
		//System.out.println(url.substring(idx+1));
		
		String[] str = url1.split("&");

		for(int k=0; k<str.length; k++) {
			//System.out.println(str[k]);
			if(str[k].startsWith(paramName)) {
			String[] str2=str[k].split("=");
			value=str2[1];
			}
		}
			
	        /*
			key=str2[0];
			value=str2[1];
			
		}
		map.put(key, value);
		value=map.get(key);
		*/
		
        return value;

	}
	
	public static void main(String[] args) {
		String url1="http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";
		
		String prodName=getParameter(url1,"prodName");
		System.out.println("제품 이름:"+prodName);
		
		String url2="http:/localhost/registUser?userId=USER-001&userName=홍길동&address=서울시강남구&userAge=26";
		
		String userAddress=getParameter(url2,"address");
		System.out.println("회원 주소:"+userAddress);
	}

}
