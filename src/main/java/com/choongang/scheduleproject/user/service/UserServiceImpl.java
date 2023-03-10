package com.choongang.scheduleproject.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choongang.scheduleproject.command.DepartmentVO;
import com.choongang.scheduleproject.command.EmailVO;
import com.choongang.scheduleproject.command.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int register(UserVO vo) {
		return userMapper.register(vo);
	}

	@Override
	public String checkAllId(String user_id) {
		return userMapper.checkAllId(user_id);
	}

	@Override
	public List<DepartmentVO> getAllDepartment() {
		return userMapper.getAllDepartment();
	}

	@Override
	public UserVO login(UserVO vo) {
		return userMapper.login(vo);
	}

	@Override
	public UserVO findId(UserVO vo) {
		return userMapper.findId(vo);
	}

	@Override
	public int resetPw(UserVO vo) {
		return userMapper.resetPw(vo);
	}

	@Override
	public UserVO kakaoLogin(UserVO vo) {
		return userMapper.kakaoLogin(vo);
	}

	@Override
	public void failCount(UserVO vo) {
		userMapper.failCount(vo);
		
	}

	@Override
	public void lockAccount(UserVO vo) {
		userMapper.lockAccount(vo);
	}

	@Override
	public void failReset(UserVO vo) {
		userMapper.failReset(vo);
	}

	@Override
	public void insertLog(UserVO vo) {
		userMapper.insertLog(vo);		
	}

	@Override
	public void unlockAccount(UserVO vo) {
		userMapper.unlockAccount(vo);
	}

	@Override
	public String checkAllEmail(String user_email) {
		return userMapper.checkAllEmail(user_email);
	}

	@Override
	public EmailVO verifyMail(EmailVO vo) {
		return userMapper.verifyMail(vo);
	}

	@Override
	public UserVO checkIdAndEmail(UserVO vo) {
		return userMapper.checkIdAndEmail(vo);
	}

	@Override
	public UserVO checkNameAndEmail(UserVO vo) {
		return userMapper.checkNameAndEmail(vo);
	}


}
