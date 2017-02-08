package com.yj.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yj.dao.JHL_VacationDao;
import com.yj.dto.JHL_VacationJoinDto;

@Service
public class JHL_VacationService {
	@Autowired private JHL_VacationDao vDao;
	
	public List<JHL_VacationJoinDto> getvlist(HashMap<String, Object> map){
		return vDao.getvlist(map);
	}
	public int getcnt(){
		return vDao.getcnt();
	}
	public int updateVcnt(int vcnt){
		return vDao.updateVcnt(vcnt);
	}
}
