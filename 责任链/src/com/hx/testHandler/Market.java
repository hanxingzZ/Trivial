package com.hx.testHandler;

public class Market extends TestHandler {

	@Override
	public void getCount(int d) {
		if (d < 100) {
			System.out.println("店员同意降价" + d);
		}
		super.next(d);

	}
}
