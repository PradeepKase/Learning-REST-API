package com.masai.model;

public class AccountDTO {
	private Integer srcAccno;
	private Integer desAccno;
	private Integer amount;

	
	
	AccountDTO(){
		
	}



	public Integer getSrcAccno() {
		return srcAccno;
	}



	public void setSrcAccno(Integer srcAccno) {
		this.srcAccno = srcAccno;
	}



	public Integer getDesAccno() {
		return desAccno;
	}



	public void setDesAccno(Integer desAccno) {
		this.desAccno = desAccno;
	}



	public Integer getAmount() {
		return amount;
	}



	public void setAmount(Integer amount) {
		this.amount = amount;
	}



	public AccountDTO(Integer srcAccno, Integer desAccno, Integer amount) {
		super();
		this.srcAccno = srcAccno;
		this.desAccno = desAccno;
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "AccountDTO [srcAccno=" + srcAccno + ", desAccno=" + desAccno + ", amount=" + amount + "]";
	}
	
	

}
