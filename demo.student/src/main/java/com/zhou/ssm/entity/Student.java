package com.zhou.ssm.entity;

public class Student {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  private Long id ;
	  private String name;
	  private String sex;
	  private String mobilePhone;
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}  
	  
	  
}
