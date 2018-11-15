public class User{
	private String name;
	private int pin;
	private String address;
	private long ssn;
	private long pNumber;
	
	public User(String name, int pin, String address, long ssn, long pNumber) {
		this.name = name;
		this.pin = pin;
		this.address = address;
		this.ssn = ssn;
		this.pNumber = pNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getSsn() {
		return ssn;
	}
	
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	
	public long getPNumber() {
		return pNumber;
	}
	
	public void setPNumber(long pNumber) {
		this.pNumber = pNumber;
	}
}