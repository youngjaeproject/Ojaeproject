package com.yj.dto;

public class JHL_VacationJoinDto {
	private int vnum;
	private int emnum;
	private int vcnt;
	private String ename;
	
	public JHL_VacationJoinDto(){}
	public JHL_VacationJoinDto(int vnum, int emnum, int vcnt, String ename) {
		super();
		this.vnum = vnum;
		this.emnum = emnum;
		this.vcnt = vcnt;
		this.ename = ename;
	}
	public int getVnum() {
		return vnum;
	}
	public void setVnum(int vnum) {
		this.vnum = vnum;
	}
	public int getEmnum() {
		return emnum;
	}
	public void setEmnum(int emnum) {
		this.emnum = emnum;
	}
	public int getVcnt() {
		return vcnt;
	}
	public void setVcnt(int vcnt) {
		this.vcnt = vcnt;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}
