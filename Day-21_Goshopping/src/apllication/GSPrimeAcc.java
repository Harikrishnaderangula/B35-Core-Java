package apllication;

import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}
	
}
