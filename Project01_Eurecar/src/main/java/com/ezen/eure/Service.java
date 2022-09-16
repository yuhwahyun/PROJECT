package com.ezen.eure;


public interface Service {
	public LoginDTO login(String id, String pw);
	public void insert(String name, String sb, String address, String id, String pw, String email, String birth, String tel);
	public AdminDTO login2(String id, String pw);
	public LoginDTO email(String email);
	public LoginDTO join(int custnum);
}
