package p3;

public class Account {
	
	private long accountNumber;
	private String userName;
	private	String password;
	private	int balance;
	private	int cashback;
	
	private ContactDetails cd;
	private KYCverification kyc;
	
	private	int deposit(int amount) {
		return 0;
	}
	private	int withdrawl(int amount) {
		return 0;
	}
	
	public Account(long accountNumber, String userName, String password, int balance, int cashback, ContactDetails cd,
			KYCverification kyc) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
		this.cashback = cashback;
		this.cd = cd;
		this.kyc = kyc;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCashback() {
		return cashback;
	}
	public void setCashback(int cashback) {
		this.cashback = cashback;
	}
	public ContactDetails getCd() {
		return cd;
	}
	public void setCd(ContactDetails cd) {
		this.cd = cd;
	}
	public KYCverification getKyc() {
		return kyc;
	}
	public void setKyc(KYCverification kyc) {
		this.kyc = kyc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



