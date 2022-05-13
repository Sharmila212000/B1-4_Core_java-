package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	public void bookProduct(float charges) {
		System.out.println(charges+deliveryCharges);
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s, toString()=%s, getClass()=%s, hashCode()=%s]",
				deliveryCharges, super.toString(), getClass(), hashCode());
	}
	
	

}
