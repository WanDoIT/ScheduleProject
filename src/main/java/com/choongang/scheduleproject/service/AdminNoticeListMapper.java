package com.choongang.scheduleproject.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.choongang.scheduleproject.command.AdminNoticeListVO;
import com.choongang.scheduleproject.util.Criteria;

@Mapper
public interface AdminNoticeListMapper {
	
	public ArrayList<AdminNoticeListVO> getList(Criteria cri); //페이지
	public int getTotal(Criteria cri); //전체 게시글수
	public int getCount(Criteria cri); //검색 결과건
	

}
