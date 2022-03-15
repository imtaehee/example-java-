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
		    System.out.println("통화 시간 : "+time +"분");
		    battery -= time*0.5;
		    
		    if(battery<0) {
		    	battery=0;
		    }
		}else {
	    	throw new IllegalArgumentException("통화시간입력오류");
		}
	}
	public void charge(int time) {
		if(time>=0) {
			System.out.println("충전 시간 : "+time+ "분");
			battery += time*3;
			
			if(battery>=100) {
		    	battery=100;
		    }
		}else {
	    	throw new IllegalArgumentException("충전시간입력오류");
		}
	}
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
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
			System.out.println("동일 모델입니다.");
		}else {
			System.out.println("다른 모델입니다.");
		}
	}

}
