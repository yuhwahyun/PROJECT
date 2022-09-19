package com.ezen.eure;

import java.util.ArrayList;

public interface Service {
	public LoginDTO login(String id, String pw,  String email);
	public void insert(String name, String sb, String address, String id, String pw, String email, String birth, String tel);
	public AdminDTO login2(String id, String pw);
	public ArrayList<OneDTO> qsout();
	public void qsinsert(String title, String content, String qlist, int custnum);
}
