package client;

import apllication.GSNormalAcc;
import apllication.GSPrimeAcc;
import apllication.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory f=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(2143,"neelavathi",500,true);
		NormalAcc n=new GSNormalAcc(2144,"Amrutha",500,70);
		System.out.println("Prime Account Details: ");
		p.bookproduct(p.getCharges());
		
		System.out.println();
		
		System.out.println("Normal Account Details: ");
		n.bookproduct(n.getCharges());
		
		System.out.println();

		
		System.out.println(p);
		System.out.println(n);

		



	}

}
