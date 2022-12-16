package enumdemo;

public enum EnumCards implements CardDemo {
	DIAMOND, HEART,CLUB,SPADES;
	@Override
	public void accept() {
		System.out.println("Selected shape in the cards are: "+this);
}
	
}
