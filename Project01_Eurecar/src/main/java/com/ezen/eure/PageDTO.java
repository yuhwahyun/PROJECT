package com.ezen.eure;
public class PageDTO {  //11111111111111111111
            // ����������,����������,��������,�Խñ� �Ѱ���,��������۰���,������������, start, end
   private int nowPage, startPage, endPage, total, cntPerPage, lastPage, start, end;
   private int cntPage=10;  //�� ȭ�鿡 ǥ���ϰ��� �ϴ� ���� ��
   public int getCntPage() {
	return cntPage;
}
public void setCntPage(int cntPage) {
	this.cntPage = cntPage;
}
public PageDTO() {
      super();
      // TODO Auto-generated constructor stub
   }				
   public PageDTO(int total, int nowPage, int cntPerPage) {
      setNowPage(nowPage);
      setCntPerPage(cntPerPage);
      setTotal(total);
      calcLastPage(getTotal(), getCntPerPage());
      calcStartEndPage(getNowPage(), cntPage);
      calcStartEnd(getNowPage(), getCntPerPage());
           
   }   
   // ���ϸ��������������				//1				//5
   public void calcLastPage(int total, int cntPerPage) {
	   setLastPage((int) Math.ceil((double)total / (double)cntPerPage));
   }
	   //4    //��ü �������� ���������� ǥ���Ҽ��ִ� ���ڵ�� ������  
   //����,�� ������ ���				//1				//10
   public void calcStartEndPage(int nowPage, int cntPage) {
      setEndPage(((int)Math.ceil((double)nowPage / (double)cntPage)) * cntPage);
      	//1									//0.1	* 10
      
      	//4					//1
      if (getLastPage() < getEndPage()) {
         setEndPage(getLastPage());
      }
      setStartPage(getEndPage() - cntPage + 1);
      if(getStartPage()<1) {		
    	  setStartPage(1);
    	  		//1
      }
   }
   
   // DB ������ ����� start,end�� ���
   public void calcStartEnd(int nowPage, int cntPerPage) {
      setEnd(nowPage * cntPerPage);
      			//1			//5
      setStart(getEnd() - cntPerPage + 1);
   }	//1		//5			//5??
   
   public int getNowPage() {
      return nowPage;
   }
   public void setNowPage(int nowPage) {
      this.nowPage = nowPage;
   }
   public int getStartPage() {
      return startPage;
   }
   public void setStartPage(int startPage) {
      this.startPage = startPage;
   }
   public int getEndPage() {
      return endPage;
   }
   public void setEndPage(int endPage) {
      this.endPage = endPage;
   }
   public int getTotal() {
      return total;
   }
   public void setTotal(int total) {
      this.total = total;
   }
   public int getCntPerPage() {
      return cntPerPage;
   }
   public void setCntPerPage(int cntPerPage) {
      this.cntPerPage = cntPerPage;
   }
   public int getLastPage() {
      return lastPage;
   }
   public void setLastPage(int lastPage) {
      this.lastPage = lastPage;
   }
   public int getStart() {
      return start;
   }
   public void setStart(int start) {
      this.start = start;
   }
   public int getEnd() {
      return end;
   }
   public void setEnd(int end) {
      this.end = end;
   }   
   
}

//System.out.println("��ü ���ڵ��� ��"+getTotal());
//System.out.println("��ü �������� ��"+getLastPage());
//System.out.println("������������"+getStartPage());
//System.out.println("�� ������ ��"+getEndPage());     
