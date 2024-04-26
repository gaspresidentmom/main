package com.green.evalBbs.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.green.evalBbs.dto.EvalBbsDto;

@Mapper
public interface IEvalBbsDao {
	
	public List<EvalBbsDto> getList();
	public EvalBbsDto getOneList(@Param("bno") int bno);
	
	public void write(@Param("title") String title , @Param("content") String content , 
			@Param("writer") String writer, @Param("regdate") Date date);
	
	public void delete(@Param("bno") int bno);
	
}




	

