package services;

public class UsaInterestService implements InterestService {

	private double interestRate;
	
	public UsaInterestService(double insterestRate) {
		this.interestRate = insterestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	
}
