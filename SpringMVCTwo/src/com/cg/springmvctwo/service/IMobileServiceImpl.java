package com.cg.springmvctwo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.springmvctwo.dao.IMobileDao;
import com.cg.springmvctwo.dto.Mobile;

@Service("mobileservice")
@Transactional
public class IMobileServiceImpl implements IMobileService{

	@Autowired
	IMobileDao mobiledao;
	
	@Override
	public void addMobile(Mobile mobile) {
		mobiledao.addMobile(mobile);
	}

	@Override
	public List<Mobile> showAllMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return null;
	}

}
