package com.choongang.scheduleproject.project.service;




import com.choongang.scheduleproject.command.ProjectMemberVO;

import java.util.ArrayList;
import java.util.List;

import com.choongang.scheduleproject.command.ChatVO;

import com.choongang.scheduleproject.command.ProjectVO;
import com.choongang.scheduleproject.command.UserVO;



public interface ProjectService {
	
	//프로젝트 등록
	public int regist(ProjectVO vo);
	

	//프로젝트 별 팀원 등록
	public int registMember(ProjectMemberVO pvo);
	
	//부서 목록
	public List<ProjectVO> getDepList();
	
	//부서별 팀원 목록
	public List<ProjectVO> getDepMemberList(int department_id);



	public ArrayList<UserVO> getProjectMember(String pj_num);
	
	public UserVO getUserVO(String user_id);
	
	public int setChat(ChatVO vo);
	
	public ArrayList<ChatVO> getChat(String pj_num);
	
	public int deleteChat(int chat_num);
	
	public int modifyChat(int chat_num, String modifyContent);
	
}

