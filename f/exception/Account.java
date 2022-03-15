package f.exception;

public class Account {
	
	//field
	private String accountNo=" ";
	private boolean creditLine=false;
	private int creditLineLimit=0;
	private int balance=0;
	
	//constructor
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		super();
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;
	}
	
    //setter, getter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//method
    public void withdraw(int money) throws Exception {
    	if(creditLine) {
    		if((balance+creditLineLimit-money)<0) {
    			throw new Exception("잔고부족 출금불가 합니다.");
    		}else {
    			balance -= money;
    		}
    	}else{
    		balance -= money;
    		if((balance - money)<0) {
    			throw new Exception("잔고부족 출금불가 합니다.");
    		}
    	}
		
	}
	public void deposit(int money) {
		balance += money;
	}
	@Override
	public String toString() {
		String str1= "계좌번호 : " + accountNo+",  잔고 : " + balance +"원";
		String str2= "  [[ -" + creditLineLimit +"원 마이너스통장]]";
		if(creditLine) {
			return str1+str2;
		}else {
			return str1;
		}
	}
	
	
	
	

}

























