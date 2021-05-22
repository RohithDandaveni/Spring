package com.ojas.beans;

import java.util.List;

public class Invoice {
       private String billId;
       private List<Double> mPrice;
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public List<Double> getmPrice() {
		return mPrice;
	}
	public void setmPrice(List<Double> mPrice) {
		this.mPrice = mPrice;
	}
       
	
       
       
}
