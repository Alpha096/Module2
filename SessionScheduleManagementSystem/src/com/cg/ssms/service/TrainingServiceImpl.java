package com.cg.ssms.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ssms.dao.ITrainingDAO;
import com.cg.ssms.dto.Client;

@Service("service")
@Transactional
public class TrainingServiceImpl implements ITrainingService{

	@Autowired
	ITrainingDAO trainingdao;
	
	//------------------------ 1. Session Schedule Management System --------------------------
	/*******************************************************************************************************
	 - Function Name	:	getAllDetail()
	 - Input Parameters	:	null
	 - Return Type		:	List
	 - Author			:	CAPGEMINI
	 - Creation Date	:	11/01/2018
	 - Description		:	call dao method getAllDetail() and returns List back to Controller 
	 ********************************************************************************************************/
	
	@Override
	public List<Client> getAllDetail() {
		return trainingdao.getAllDetail();
	}

}
