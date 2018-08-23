package com.admission.service;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admission.dao.StudentEnquiryRepository;
import com.admission.model.StudentEnquiry;

/**
 * @author ${Vijay Gupta}
 *
 * Aug 9, 2017
 */
@Service
@Transactional
public class StudentEnquiryService {

	  @PersistenceContext
	  private EntityManager em;
	  
	  @Autowired
		StudentEnquiryRepository repository;
		
		public StudentEnquiryService(StudentEnquiryRepository repository){
			this.repository=repository;
		}
		public String studEnq(StudentEnquiry studenq){
			String res=null;
			List<StudentEnquiry> studs = new ArrayList<>();
			 Query query=em.createNativeQuery("Select ccb.uid From Branch b Join Campus_Course_Branch_Map ccb On ccb.branch_uid = b.uid Join Campus_Course_Map cc On ccb.campus_course_uid = cc.uid Join  Campus c  On cc.campus_uid = c.uid JOIN Course co on cc.course_uid= co.uid where c.name= :campus AND b.name= :branch AND co.course_short_name= :course");
			 query.setParameter("campus",studenq.getCampus());
			 query.setParameter("branch",studenq.getBranch());
			 query.setParameter("course",studenq.getCourse());
			 System.out.println("After typed query");
			  List q=query.getResultList();
			  for (Object p : q) {
				  res=  printResult(p);
			  }
			return res;
		}
		
		
			  private String printResult(Object result) {
				    if (result == null) {
				      System.out.print("NULL");
				      return "null";
				    } else if (result instanceof Object[]) {
				      Object[] row = (Object[]) result;
				      System.out.print("[");
				      for (int i = 0; i < row.length; i++) {
				        printResult(row[i]);
				        System.out.print("VJ");
				      }
				      System.out.print("]");
				    } else if (result instanceof Long || result instanceof Double
				        || result instanceof String) {
				      System.out.print(result.getClass().getName() + ": " + result);
				      return (String) result;
				    } else {
				      System.out.print(result);
				      return (String) result;
				    }
				    System.out.println();
					return (String) result;
				  }
			  
			  public String findNameById(String id){
					List<StudentEnquiry> stud= repository.findByUid(id);
					return stud.get(0).getName();
				}
			  
			  
		public List<StudentEnquiry> findAll(){
			List<StudentEnquiry> studs = new ArrayList<>();
			List<StudentEnquiry> stud= repository.findAll();
			System.out.println(stud.get(1).getCcbUid());
			for(StudentEnquiry q : stud){
				studs.add(q);
			}
			return studs;
		}
		
		public void save(StudentEnquiry stud){
			repository.save(stud);
		}
		
		public void delete(int id){
			repository.delete(id);
		}
	}


