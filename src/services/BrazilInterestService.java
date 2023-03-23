package services;

public class BrazilInterestService implements InterestService {

	private double interestRate;
	
	public BrazilInterestService(double insterestRate) {
		this.interestRate = insterestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}


	
	
}
