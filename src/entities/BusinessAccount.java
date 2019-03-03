package entities;

public final class BusinessAccount extends Account {

	private Double loanLimite; // limite de emprestimo

	public BusinessAccount() {
		super();

	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}

	public Double getLoanLimite() {
		return loanLimite;
	}

	public void setLoanLimite(Double loanLimite) {
		this.loanLimite = loanLimite;
	}

	public void loan(double amount) {
		if (amount <= loanLimite) {
			balance += amount - 10;
		}

	}
	@Override
	public void withdraw(double amount) {
		balance -=  amount;

	}

}
