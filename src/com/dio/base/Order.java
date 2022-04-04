package com.dio.base;

public class Order {

	private final String code;
	private final double totalValue;

	public Order (String code, double totalValue){
		this.code = code;
		this.totalValue = totalValue
	}
	
	@Override
	public String toString() {
		return "Order=[" +
			"code='" + code + "'" + 
			"fee='"+ calculaFee + "'" +
			"]";
	}

	private double calculateFee(){
		if (totalValue > 100){
			return totalValue;
		}else{
			return totalValue * 0.99;
		}
	}
}
