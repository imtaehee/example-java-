package e.api;
/*
���ڵ� ��Ģ : ���ڷ� ���� ���ڿ��� ������ ��ҹ����̰ų� ������ ��쿡�� �״�� ����
�ѱ��̸� 16���� ������ ��ȯ �� ��ȯ�� �� �տ� '%' ��ȣ �߰�

16������ ��ȯ�� ���� ffffffb4�� ��� 7,8�� �ڸ��� ���� "b4"�� �빮�ڷ� ��ȯ�Ǿ� ���
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
		System.out.println("�Է�:Korea");
		System.out.println("���:"+p1.toEndcoding("Korea"));
		System.out.println("�Է�:ȫ�浿");
		System.out.println("���:"+p1.toEndcoding("ȫ�浿"));
		System.out.println("�Է�:ȫ �� ��");
		System.out.println("���:"+p1.toEndcoding("ȫ �� ��"));
		System.out.println("�Է�:Hong �� ��");
		System.out.println("���:"+p1.toEndcoding("Hong �� ��"));
		System.out.println("�Է�:0319");
		System.out.println("���:"+p1.toEndcoding("0319"));
	}

}
