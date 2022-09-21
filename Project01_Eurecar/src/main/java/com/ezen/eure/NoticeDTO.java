package com.ezen.eure;

public class NoticeDTO {
int nnum;
String ntitle,ndate,ncontent;
int nreadcnt,custnum;
public NoticeDTO() {
	// TODO Auto-generated constructor stub
}
public int getNnum() {
	return nnum;
}
public void setNnum(int nnum) {
	this.nnum = nnum;
}
public String getNtitle() {
	return ntitle;
}
public void setNtitle(String ntitle) {
	this.ntitle = ntitle;
}
public String getNdate() {
	return ndate;
}
public void setNdate(String ndate) {
	this.ndate = ndate;
}
public String getNcontent() {
	return ncontent;
}
public void setNcontent(String ncontent) {
	this.ncontent = ncontent;
}
public int getNreadcnt() {
	return nreadcnt;
}
public void setNreadcnt(int nreadcnt) {
	this.nreadcnt = nreadcnt;
}
public int getCustnum() {
	return custnum;
}
public void setCustnum(int custnum) {
	this.custnum = custnum;
}
public NoticeDTO(int nnum, String ntitle, String ndate, String ncontent, int nreadcnt, int custnum) {
	super();
	this.nnum = nnum;
	this.ntitle = ntitle;
	this.ndate = ndate;
	this.ncontent = ncontent;
	this.nreadcnt = nreadcnt;
	this.custnum = custnum;
}


}
