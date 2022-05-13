package com.tns.application;

import com.tns.framework.*;

public class GSShopFactory extends ShopFactory{
	
	
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}

	
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
		return n;
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(123,"sharmila",250,true);
		NormalAcc n=new GSNormalAcc(124,"varsha",300,10);
		p.bookProduct(p.charges);
		n.bookProduct(n.charges);
		System.out.println(s.getNewPrimeAcc(1, "thanu", 1236, true));
		System.out.println(s.getNewNormalAcc(800, "kannika", 1000, 50));
		
		System.out.println(p);
		System.out.println(n);
		}

}
