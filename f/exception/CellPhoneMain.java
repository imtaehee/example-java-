package f.exception;

class CellPhone{
	//Field
	String model=" ";
	double battery=0;
	//Constructor
	public CellPhone() {
	}
	public CellPhone(String model) {
		this.model=model;
	}
	//method
	public void call(int time) {
		if(time>=0) {
		    System.out.println("��ȭ �ð� : "+time +"��");
		    battery -= time*0.5;
		    
		    if(battery<0) {
		    	battery=0;
		    }
		}else {
	    	throw new IllegalArgumentException("��ȭ�ð��Է¿���");
		}
	}
	public void charge(int time) {
		if(time>=0) {
			System.out.println("���� �ð� : "+time+ "��");
			battery += time*3;
			
			if(battery>=100) {
		    	battery=100;
		    }
		}else {
	    	throw new IllegalArgumentException("�����ð��Է¿���");
		}
	}
	public void printBattery() {
		System.out.println("���� ���͸� �� : "+battery);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CellPhone && obj!=null) {
			CellPhone otherPhone=(CellPhone)obj;
			return this.model.equals(otherPhone.model);
		}else {
			return false;
		}
	}
}

public class CellPhoneMain {
	
	public static void main(String[] args) {
		
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge(20);
		myPhone.printBattery();
		
		myPhone.call(300);
		myPhone.printBattery();
		
		myPhone.charge(50);
		myPhone.printBattery();
		
		myPhone.call(40);
		myPhone.printBattery();
		
		try {
			myPhone.call(-20);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		CellPhone yourPhone=new CellPhone("SCH-600");
		
		if(myPhone.equals(yourPhone)) {
			System.out.println("���� ���Դϴ�.");
		}else {
			System.out.println("�ٸ� ���Դϴ�.");
		}
	}

}
