package com.javaex.phone;

public class PersonVo {

	private String name;
	private String hp;
	private String compay;
	
	
	public PersonVo() {
		super();
	}
	public PersonVo(String name, String hp, String compay) {
		super();
		this.name = name;
		this.hp = hp;
		this.compay = compay;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompay() {
		return compay;
	}
	public void setCompay(String compay) {
		this.compay = compay;
	}
	
	
	@Override
	public String toString() {
		return "PersonVo [name=" + name + ", hp=" + hp + ", compay=" + compay + "]";
	}
	
	

	
	
}
