package com.cg.springmvctwo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		Query query = em.createQuery("FROM Mobile");
		List<Mobile> myAll=query.getResultList();
		return myAll;
		
	}

	@Override
	public void deleteMobile(int mobId) {
		Query query1=em.createQuery("DELETE FROM Mobile WHERE mobId=:mobileId");
		query1.setParameter("mobileId", mobId);
		query1.executeUpdate();
	}

	@Override
	public Mobile searchMobile(int mobId) {
		Query querySearch = em.createQuery("FROM Mobile WHERE mobId=:mobdata");
		querySearch.setParameter("mobdata", mobId);
		Mobile mob= (Mobile) querySearch.getResultList().get(0);
		return mob;
	}

	@Override
	public void updateMobile(int mobId, double price) {
		Query query1=em.createQuery("UPDATE Mobile SET price=:pr WHERE mobId=:mobileId");
		query1.setParameter("mobileId", mobId);
		query1.setParameter("pr", price);
		query1.executeUpdate();
		
	}

}
