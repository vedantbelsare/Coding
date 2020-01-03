package com.tektaurus.bean;

public class Employee {
	
	private int eid;
	private String ename;
	private String emobile;
	private String eaddress;
	private String estream;
	public int geteid() {
		return eid;
	}
	public void seteid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return ename;
	}
	public void seteName(String ename) {
		this.ename = ename;
	}
	public String geteMobile() {
		return emobile;
	}
	public void seteMobile(String emobile) {
		this.emobile = emobile;
	}
	public String geteAddress() {
		return eaddress;
	}
	public void seteAddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public String geteStream() {
		return estream;
	}
	public void seteStream(String estream) {
		this.estream = estream;
	}
	public Employee(int eid, String ename, String emobile, String eaddress,String estream) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.emobile = emobile;
		this.eaddress = eaddress;
		this.estream = estream;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", emobile=" + emobile	+ ", eaddress=" + eaddress + ", estream=" + estream + "]";
	}
}
