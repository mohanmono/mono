
public class SavingsBalance {
	public static int annualInterestRate;
	double Savings;
	public SavingsBalance (double balance) {
		this.Savings =balance;
	}
		public static void calculateMonthlyInterest() {
			Double savingsBalance;
			Double Interest=(savingsBalance +(annualInterestRate/100.0)*12));
			savingsBalance=savingsBalance + Interest;
					
		}
		public static void modifyInterestRate(int newValue) {
			annualInterestRate=newValue;						
		}
		public void showBalance() {
			System.out.println("balance"+SavingsBalance);
		}
		public static void main(String args[]){
			SavingsBalance s1=new SavingsBalance(2000);
			SavingsBalance s2=new SavingsBalance(3000);
			SavingsBalance.modifyInterestRate(5);
			s1.showBalance();
			s2.showBalance();
			s1.calculateMonthlyInterest();
			s2.calculateMonthlyInterest();
			s1.showBalance();
			s2.showBalance();
			SavingsBalance.modifyInterestRate(4);
			s1.calculateMonthlyInterest();
			s2.calculateMonthlyInterest();
			s1.showBalance();
			s2.showBalance();

		}
		
		
		
		
	}
	
	
	
	


