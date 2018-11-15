package com.cg.ssms.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.cg.ssms.dto.Client;

@Repository("trainingdao")
public class TrainingDaoImpl implements ITrainingDAO{

	@PersistenceContext
	EntityManager em;
	
	//------------------------ 1. Session Schedule Management System --------------------------
			/*******************************************************************************************************
			 - Function Name	:	getAllDetail()
			 - Input Parameters	:	null
			 - Return Type		:	List
			 - Author			:	CAPGEMINI
			 - Creation Date	:	11/01/2018
			 - Description		:	Retrieving list from table
			 ********************************************************************************************************/
	
	public List<Client> getAllDetail() {
		Query queryGet=em.createQuery("FROM Client");
		List<Client> list=queryGet.getResultList();
		return list;
	}
	
}
