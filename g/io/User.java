package g.io;

public class User {
	
	//field
	private String name;
	private String address;
	private String cellularNumber;
	private boolean male;
	
	//constructor
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String address, String cellularNumber, boolean male) {
		super();
		this.name = name;
		this.address = address;
		this.cellularNumber = cellularNumber;
		this.male = male;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellularNumber() {
		return cellularNumber;
	}

	public void setCellularNumber(String cellularNumber) {
		this.cellularNumber = cellularNumber;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	@Override
	public String toString() {
		
		String gender="여";
		if(male) {
			gender="남";
		}
		
		return ":: 이름: " + name +  ", 핸드폰: " + cellularNumber + ", 성별: " + gender
				+", 주소: " + address;
	}
	
	
	
}
