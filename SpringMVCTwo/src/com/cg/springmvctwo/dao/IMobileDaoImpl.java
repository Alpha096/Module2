package com.cg.springmvctwo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.springmvctwo.dto.Mobile;

@Repository("mobiledao")
public class IMobileDaoImpl implements IMobileDao{

	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addMobile(Mobile mobile) {
		em.persist(mobile);	
		em.flush();
	}

	@Override
	public List<Mobile> showAllMobile() {
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
