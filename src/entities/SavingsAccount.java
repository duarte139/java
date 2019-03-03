package entities;

public final class SavingsAccount extends Account {
	protected Double interestRate; // taxa de juro;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;

	}


}
