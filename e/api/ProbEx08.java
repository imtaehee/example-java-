package e.api;

/*
 * ù��° ���ڿ��� �ι�° ���ڿ��� �����ڷ� �߶󳻾� �迭�� ������ �� ����
 * String class�� split()�޼���� StringTokenizer�� ����ؼ� �ȵȴ�
 */

public class ProbEx08 {
	
    private static String[] stringSplit(String str1, String str2) {
    	
    	int start=0;
    	int end=str1.indexOf(str2);
    	int count=0;
    	
    	for(int i=0; i<str1.length(); i++) {
    		if(str1.charAt(i)=='#') {
    			count++;
    		}
    	}
    	
    	String[] arr=new String[count+1];
    	
    	for(int i=0;i<arr.length; i++) {
    		arr[i]=str1.substring(start,end);
    		start=end+1;
    		
    		int index=str1.indexOf(str2, start+1);
    		if(index==-1) {
    			end=str1.length()-1;
    		}else {
    			end=index;
    		}
    	}
    	return arr; 	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("===���ڿ� ó�����===");
	    for(int i=0; i<strs.length; i++) {
	    	System.out.println(strs[i]);
	    }
	}

}
