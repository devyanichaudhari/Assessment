package com.eb.pojo;

public class Waiter 
{
	private int wId;
	private String wName;
	public int getwId() {
		return wId;
	}
	public void setwId(int wId) {
		this.wId = wId;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public Waiter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Waiter(String wName) {
		super();
		this.wName = wName;
	}
	@Override
	public String toString() {
		return "Waiter [wId=" + wId + ", wName=" + wName + "]";
	}
}