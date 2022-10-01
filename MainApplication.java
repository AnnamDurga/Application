package p3;

import java.util.Random;
import java.util.Scanner;

public class MainApplication {
	Account allAccount[] = new Account[50000];
	int noOfAccount = 0;
			
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	public static void main(String[] args) { 
	
	MainApplication app = new MainApplication();

	while (true) {
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("1. TO Add Bank Account:  ");
		System.out.println("2. View All Account Details:  ");
		System.out.println("3. Deposit Amount:  ");
		System.out.println("4. View All Contact Details:  ");
		System.out.println("5. View All KYCDocument Details:  ");
		System.out.println("6. Check Balance:  ");
		System.out.println("7. Change Mobile Number:  ");
		System.out.println("8. Change EmailID:  ");
		System.out.println("0. Exit ");

		System.out.println("Enter ur choice :- ");

		switch (app.sc1.nextInt()) {

		case 1:
			app.submitUserDetails();
			break;
			
		case 2:
			app.printUserAllDetails();
			break;
			
		case 3:
			app.doDepositOperation();
			break;
			
		case 4:
			app.printUserContactDetails();
			break;
		case 5:
			app.printUserKYCDocumentDetails();
			break;
		case 6:
			app.printBalance();
			break;
		case 7:
			app.changeMobileNumber();
			break;
		case 8:
			app.changeEmailId();
			break;
			
	

		default:
			System.out.println("Exit ");
			System.exit(0);
		}//end of switch
	
	}
}
	private void submitUserDetails(){

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		


        System.out.print("2. Enter your Account Number: ");
        long accountNumber = sc1.nextInt();
		//account
			        System.out.print("1. Enter Your Name: ");
			        String userName = sc.nextLine();
			        
			        System.out.print("3. Enter Your password  ");
			        String password = sc.nextLine();
			        
			        System.out.print("4. Enter your Balance:  ");
			        int balance = sc1.nextInt();
			        System.out.print("5. Enter your cashback:  ");
			        String cashback = sc.nextLine();
			        
		//contact Details	        

			        System.out.print("6. Enter Your House Number: ");
			        int houseNumber = sc1.nextInt();
			       
			        System.out.print("7. Enter your City Name: ");
			        String cityName = sc.nextLine();
			        
			        System.out.print("8. Enter Your State Name  ");
			        String stateName = sc.nextLine();
			        
			        System.out.print("9. Enter your Country Name:  ");
			        String countryName = sc.nextLine();
			        System.out.print("10. Enter your Pin Code:  ");
			        int pinCode = sc1.nextInt();
			        System.out.print("11. Enter your Email ID:  ");
			        String emailID = sc.nextLine();
			        System.out.print("12. Enter your Mobile Number:  ");
			        long mobileNumber = sc1.nextInt();
			        
		//KYC	        
			        System.out.print("13. Enter your Pan Number:  ");
			        String panNumber = sc.nextLine();
			        System.out.print("14. Enter your Aadhar Number:  ");
			        long aadharNumber = sc1.nextInt();
			        System.out.print("15. Enter your Document Type:  ");
			        String documentType = sc.nextLine();
			        
			        
			        System.out.println("====>To add More Account Press'1' otherwise press'0'/n");
			        
			//        allAccount[noOfAccount++] = new Account(userName, accountNumber, password,balance,cashback);
			        KYCverification kyc = new KYCverification(panNumber,aadharNumber,documentType );
			        ContactDetails cd = new ContactDetails(houseNumber,cityName,stateName,countryName,pinCode,emailID,mobileNumber);
			        Account ac =new Account((int) accountNumber,userName,password,balance,cashback);
					ac.setCd(cd);
					ac.setKyc(kyc);
					ac.setAccountNumber(accountNumber);
					ac.setBalance(balance);
					ac.setUserName(userName);
					ac.getCashback();
					ac.setPassword(password);
					
					
					allAccount[noOfAccount++] = ac;
					System.out.println(" "+ac);
					System.out.println(" Added in the List "); 
					 System.out.println("To add another Student Record Press 1 otherwise press 6");
				        
			}

	public Account getAllDetail(long searchAcNumber)
	{
		for(long i = 0;i<noOfAccount;i++)
		{
			Account ac = allAccount[(int) i];
			
			boolean isFound = (ac.getAccountNumber() == searchAcNumber)?true:false;
			
			if(isFound)
			{
				return ac;
			}
			
		}
		return null;
	}
	
		private void printUserAllDetails() {
			
			
			System.out.print("Enter Searched Account Number  ");
			long searchAcNumber = sc1.nextInt();
			
			Account ac = getAllDetail(searchAcNumber);
			System.out.println("--------------------------------------------------");
			System.out.println(ac);
			System.out.println("--------------------------------------------------");
	}
		
		
		
		
		
		private void changeEmailId() {
			System.out.println("Enter the Account Number");
			long accNo = sc1.nextInt();
			
			Account ac = getAllDetail(accNo);
			
			System.out.println(ac.getCd());
			
			System.out.println(" ---- Enter New Email Id ---- ");
			String eID = sc.nextLine(); 
			
			ac.getCd().setEmailID(eID);
			
			System.out.println("--------------------------------------------------");
			System.out.println(" --->> Successful...! :- ");
			System.out.println("your new Email Id-    "+ac.getCd().getEmailID());
			
			System.out.println("--------------------------------------------------");
		}
		
	   
		
		
		private void changeMobileNumber() {
		System.out.print("Enter the Account Number");
		long accNo = sc1.nextInt();
		
		Account ac = getAllDetail(accNo);
		
		System.out.println(ac.getCd());
		
		System.out.print(" ---- Enter New Mobile Number ---- ");
		long mobNo = sc1.nextInt();
		
		ac.getCd().setMobileNumber(mobNo);
		System.out.println("--------------------------------------------------");
		System.out.println(" --->> New Account after updation :- ");
		System.out.println("your new Mobile No.-    "+ac.getCd().getMobileNumber());
		System.out.println("--------------------------------------------------");
	}
		
		
		
		
		private void printBalance() {
		
		System.out.println("Enter Account Number");
		long accNo = sc1.nextInt();
		
		Account ac = getAllDetail(accNo);
		System.out.println("--------------------------------------------------");
		System.out.println(ac.getBalance());
		System.out.println("--------------------------------------------------");
		
	}
		
		
		
		private void printUserKYCDocumentDetails() {
			System.out.println("Enter Account Number");
			long accNo = sc1.nextInt();
			
			Account ac = getAllDetail(accNo);
			System.out.println("--------------------------------------------------");
			System.out.println(ac.getKyc());
			System.out.println("--------------------------------------------------");
		
	}
		
		
		
		private void printUserContactDetails() {
			System.out.print("Enter the Account Number");
			long accNo = sc1.nextInt();
			
			Account ac = getAllDetail(accNo);
			
			System.out.println(ac.getCd());
			

		
	}
		private void doDepositOperation() {
			

			System.out.print("Enter Account Number");
			long accNo = sc1.nextInt();
			
			Account ac = getAllDetail(accNo);
			
			System.out.print(" Enter the Amount: ");
			int AmountDeposit = sc.nextInt();
			
			ac.setBalance(ac.getBalance()+AmountDeposit);

			
					System.out.println("--------------------------------------------------");
					System.out.println(" Money has been deposited. Current Balance :- "+ac.getBalance()+" \n ");
					System.out.println("--------------------------------------------------");
					
			}
		
			
			
			
			
	
		private void displayAllAcc(Account ac) {
			System.out.println("--------------------------------------------------");
			System.out.println("\n"+ac.getUserName() + "\t");
			System.out.println(ac.getAccountNumber()+"\t");
			System.out.println(ac.getBalance()+"\t");
			System.out.println(ac.getPassword()+"\t");
			System.out.println("\n---------------------------------------------\n");
		// TODO Auto-generated method stub
		
	}
		

		
	
	

}






	


