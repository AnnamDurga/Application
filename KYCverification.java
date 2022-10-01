package p3;

public class KYCverification {
	
	private String panNumber;
	private	long aadharNumber;
	private	String documentType;
	
	
	
	public KYCverification(String panNumber, long aadharNumber, String documentType) {
		super();
		this.panNumber = panNumber;
		this.aadharNumber = aadharNumber;
		this.documentType = documentType;
		
	}
	
	
	
	public KYCverification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	


	@Override
	public String toString() {
		return "KYCverification [panNumber=" + panNumber + ", aadharNumber=" + aadharNumber + ", documentType="
				+ documentType  + ", getPanNumber()=" + getPanNumber()
				+ ", getAadharNumber()=" + getAadharNumber() + ", getDocumentType()=" + getDocumentType()
				+ ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}



