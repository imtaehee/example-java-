package d.inheritance;

class CellPhone{
	//field
	private String phoneNumber=" ";
	private int totalCallTime=0;
	private int totalFee=0;
	private int feePerCallTime=0;
	
	//constructor
	public CellPhone() {
	}
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber=phoneNumber;
		this.feePerCallTime=feePerCallTime;
	}
	
	//setter,getter
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	
	//method
	public void call(String otherPhoneNumber,int callTime) {
		System.out.println(otherPhoneNumber+ " ��ȣ�� " +callTime+ " ��ȭ��");
		totalCallTime+=callTime;
	}
	public void calculateTotalFee() {
		totalFee=feePerCallTime*totalCallTime;
		return;
	}	
}

class SmartPhone extends CellPhone{
	//field
	private boolean isMonthlyFixedRate=false;
	private int monthlyFixedFee=0;
	
	//constructor
	public SmartPhone() {
	}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber,feePerCallTime);
	}
	public SmartPhone(String phoneNumber,int feePerCallTime,boolean isMonthlyFixedRate,int monthlyFixedFee) {
		super(phoneNumber,feePerCallTime);
		this.isMonthlyFixedRate=isMonthlyFixedRate;
		this.monthlyFixedFee=monthlyFixedFee;
		System.out.println("������ "+ monthlyFixedFee+ " ���� ������Դϴ�.");
	}
	
	//setter,getter
	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}
	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}
	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}
	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	//method
	@Override
	public void calculateTotalFee() {
		if(isMonthlyFixedRate) {
            super.setTotalFee(super.getTotalFee()+monthlyFixedFee);
		}else {
			super.calculateTotalFee();
		}
	}
}

public class ProbEx03 {
	public static void main(String[] args) {
		
		CellPhone cellPhone=new CellPhone("010-010-010",1000);
		cellPhone.call("017-017-017",10);
		cellPhone.call("016-016-016",10);
		cellPhone.calculateTotalFee();
		System.out.println(cellPhone.getPhoneNumber()+ "�� ��ȭ�ð��� "+
				           cellPhone.getTotalCallTime()+ "�̸�\n�ܰ� "+
				           cellPhone.getFeePerCallTime()+
				           " �� ����� "+cellPhone.getTotalFee()+ "�� �Դϴ�.");
		
		System.out.println("=========================================");
		
		SmartPhone smartPhone=new SmartPhone("000-000-000",200);
		smartPhone.call("017-017-017",10);
		smartPhone.calculateTotalFee();
		System.out.println(smartPhone.getPhoneNumber()+ "�� ��ȭ�ð��� "+
				           smartPhone.getTotalCallTime()+ "�̸�\n�ܰ� "+
				           smartPhone.getFeePerCallTime()+
				           " �� ����� "+smartPhone.getTotalFee()+ "�� �Դϴ�.");
		
		System.out.println("=========================================");
		
		SmartPhone smartPhone01=new SmartPhone("111-111-111",0,true,3000);
		smartPhone01.call("017-017-017",10);
		smartPhone01.call("016-016-016",10);
		smartPhone01.calculateTotalFee();
		System.out.println(smartPhone01.getPhoneNumber()+ "�� ��ȭ�ð��� "+
				           smartPhone01.getTotalCallTime()+ "�̸�\n�ܰ� "+
				           smartPhone01.getFeePerCallTime()+
				           " �� ����� "+smartPhone01.getTotalFee()+ "�� �Դϴ�.");
	           
	}
}