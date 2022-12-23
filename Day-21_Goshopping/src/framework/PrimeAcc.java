package framework;

public abstract class PrimeAcc extends ShopAcc {

	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	
	
	public PrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
	
	}


	@Override
	public void bookproduct(float charges)
	{

		System.out.println("Account no.is: "+this.getAccNo()+" "+
				"Account name is: "+this.getAccNm()+" "+
				"Charges is: "+(charges+deliveryCharges));
		
	}


	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}

	
	
	
}
