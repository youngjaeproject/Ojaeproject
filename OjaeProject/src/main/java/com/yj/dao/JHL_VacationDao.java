package com.yj.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yj.dto.JHL_VacationJoinDto;

@Repository
public class JHL_VacationDao {
	@Autowired private SqlSession sqlSession;
	private final String NAMESPACE = "orm.mybatis.JHL_VacationMapper.";
	
	public List<JHL_VacationJoinDto> getvlist(HashMap<String, Object> map){
		return sqlSession.selectList(NAMESPACE + "getlist", map);
	}
	public int getcnt(){
		return sqlSession.selectOne(NAMESPACE + "getcnt");
	}
	public int updateVcnt(int vcnt){
		return sqlSession.update(NAMESPACE + "updateVcnt", vcnt);
	}
}
