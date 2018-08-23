package com.admission.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admission.dao.StaffInfoRepository;
import com.admission.model.StaffInfo;
import com.admission.model.StudentEnquiry;
import com.admission.model.StudentVisitor;

@Service
@Transactional
public class StaffInfoService {

	 @PersistenceContext
	  private EntityManager em;
	
	  @Autowired
	  StaffInfoRepository repository;


	public StaffInfoService(StaffInfoRepository repository) {
		this.repository = repository;
	}
	
	 public String findStaffNameById(String id){
			List<StaffInfo> stud= repository.findByUid(id);
			return stud.get(0).getName();
		}
	
	
	public List<StaffInfo> findAll(){
		List<StaffInfo> studs = new ArrayList<>();
		for(StaffInfo stud : repository.findAll()){
			studs.add(stud);
		}
		return studs;
	}
	
	
	
	public void save(StaffInfo stud){
		repository.save(stud);
	}
	
	/*public void delete(int id){
		repository.delete(id);
	}*/

	/* public List<StaffInfo> findStaffName(String name){
	List<StaffInfo> studs = new ArrayList<>();
	for(StaffInfo stud : repository.findByName(name)){
			studs.add(stud);
		}
	System.out.println(studs.get(1));
				return studs;
	}
	*/
	  
	  
	  
}
