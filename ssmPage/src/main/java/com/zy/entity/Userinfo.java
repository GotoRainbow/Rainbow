package com.zy.entity;

public class Userinfo {
	private Integer user_id;
	private String user_name;
	private String user_nick;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_nick() {
		return user_nick;
	}
	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}
	@Override
	public String toString() {
		return "Userinfo [user_id=" + user_id + ", user_name=" + user_name + ", user_nick=" + user_nick + "]";
	}
}
