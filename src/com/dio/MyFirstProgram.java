package com.dio;

import com.dio.base.Order;

public class MyFirstProgram{
	public static void main(String[] args){
		final Order order = new Order(code="code1234", totalValue=99.99);
		System.out.println(order);
	}
}
