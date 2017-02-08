package com.yj.page;

public class PageUtil {
	private int pageNum;//현재페이지번호
	private int startRow;//시작행번호
	private int endRow;//끝행번호
	private int pageCount;//페이지갯수
	private int startPage;//시작페이지
	private int endPage;//끝페이지
	private int rowCount;//전체글의 갯수
	public PageUtil() {}
	
	/**
	 * 
	 * @param pageNum 페이지번호
	 * @param rowCount 전체글의 갯수
	 * @param rowBlockCount 한페이지에 보여질 글의 갯수
	 * @param pageBlockCount 한페이지에 보여질 페이지의 갯수
	 */
	public PageUtil(int pageNum,int rowCount,int rowBlockCount,int pageBlockCount){
		this.pageNum=pageNum;
		this.pageCount=rowCount;
		
		startRow=(pageNum-1)*rowBlockCount+1;//�������ȣ
		endRow=startRow+(rowBlockCount-1);//�����ȣ
		
		pageCount=(int)Math.ceil(rowCount/(double)rowBlockCount);//��ü �������� ����
		startPage=(pageNum-1)/pageBlockCount*pageBlockCount+1;//���������� ��ȣ ���ϱ� 
		endPage=startPage+pageBlockCount-1;//�������� ��ȣ���ϱ� 
		
		endPage=startPage+pageBlockCount-1;//�������� ��ȣ ���ϱ� 
		if(endPage>pageCount){
			endPage=pageCount;
		}
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
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

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	@Override
	public String toString() {
		return "PageUtil [pageNum=" + pageNum + ", startRow=" + startRow
				+ ", endRow=" + endRow + ", pageCount=" + pageCount
				+ ", startPage=" + startPage + ", endPage=" + endPage
				+ ", rowCount=" + rowCount + "]";
	}
}
