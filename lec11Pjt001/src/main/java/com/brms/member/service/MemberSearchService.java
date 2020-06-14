package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberSearchService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberSearchService() { }
	
	public Member searchMember(String mId) {
		return memberDao.select(mId);
	}
	
	public void initMethod() {
		System.out.println("create search");
	}
	
	public void destroyMethod() {
		System.out.println("destroy search");
	}
	
}