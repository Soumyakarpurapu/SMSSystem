package com.cg.schedulemanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.schedulemanagementsystem.dto.Client;

@Repository("trainingdao")
public class TrainingDAOImpl implements ITrainingDAO {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Client> getAllDetails() {
		// TODO Auto-generated method stub
		String sql="From Client";
		Query query=em.createQuery(sql);
		List<Client> myAll=query.getResultList();
		return myAll;
	}
	


}
