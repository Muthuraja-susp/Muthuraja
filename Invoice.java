package com.emp.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invoice {
	@Id
	@GeneratedValue
	@Column (name="SNO")
	private int sno;
	@Column (name="ITEMS")
	private String iname;
	@Column (name="QUANTITY")
	private Float qty;
	@Column (name="QTYxPRICE")
	private Float QTY_price;

	public Invoice() {
	}

	public Invoice(int sno, String iname, Float qty,Float QTY_price) {
		super();
		this.sno = sno;
		this.iname = iname;
		this.qty = qty;
		this.setQTY_price(qty*5);

	}

	public int getSno() {
		return sno;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public Float getQty() {
		return qty;
	}

	public void setQty(Float qty) {
		this.qty = qty;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public Float getQTY_price() {
		return QTY_price;
	}

	public void setQTY_price(Float QTY_price) {
		this.QTY_price = QTY_price;
	}
}
