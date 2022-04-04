package com.dio.base;
import java.math.BigDecimal;

/**
 * @author Victor Cleber
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */
public class Order {

	//this attribute represents the order code
	private final String code;
	private final BigDecimal totalValue;

/**
 * This is a constructor method
 * @param code			Order code
 * @param totalValue    Total Value Order
 */
	public Order (String code, BigDecimal totalValue){
		this.code = code;
		this.totalValue = totalValue;
	}
	
	@Override
	public String toString() {
		return "Order=[" +
			"code='" + code + "'" + 
			"fee='"+ calculateFee() + "'" +
			"]";
	}
/**
 * This method calculates the total fee for the order
 * If order value > $100.00, it adds a fee
 * @return Total value of fees
 * @throws RuntimeException if the total value is negative 
 */
	public BigDecimal calculateFee(){
		if (this.totalValue.signum() < 0){
				throw new RuntimeException("The order can not have values less than 0");
		}
		if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100){
				return this.totalValue.multiply(new BigDecimal("0.99"));
		}else{
				return this.totalValue;
		}
	}
}
