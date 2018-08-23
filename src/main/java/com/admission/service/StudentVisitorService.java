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
import com.admission.dao.StudentVisitorRepository;
import com.admission.model.StudentEnquiry;
import com.admission.model.StudentVisitor;

@Service
@Transactional
public class StudentVisitorService {
	
	 @PersistenceContext
	  private EntityManager em;
	  
	  @Autowired
		StudentVisitorRepository repository;
		
	  public StudentVisitorService(StudentVisitorRepository repository){
			this.repository=repository;
		}
	  
	  public String studVisit(StudentVisitor studvisit){
			String res=null;
			List<StudentEnquiry> studs = new ArrayList<>();
			 Query query=em.createNativeQuery("select se.uid From Stud_Enquiry se where se.name= :name And se.mobile= :mobile");
			 query.setParameter("name",studvisit.getName());
			 query.setParameter("mobile",studvisit.getMobile());
			 System.out.println("After typed query");
			  List q=query.getResultList();
			  for (Object p : q) {
				  res=  printResult(p);
			  }
			  System.out.println(res);
			return res;
		}
	  
	  
	  public List<StudentVisitor> findByName(StudentVisitor studvisit){
			List<StudentVisitor> studs = new ArrayList<>();
			for(StudentVisitor stud : repository.findAll()){
				studs.add(stud);
			}
			System.out.println(studs.get(1).getName());
			return studs;
		}
	  
	  public String findStaff(StudentVisitor studvisit){
			String res=null;
			List<StudentEnquiry> studs = new ArrayList<>();
			 Query query=em.createNativeQuery("select st.uid From Staff_info st where st.name= :name");
			 query.setParameter("name",studvisit.getStaffName());
			 System.out.println("After typed query");
			  List q=query.getResultList();
			  for (Object p : q) {
				  res=  printResult(p);
			  }
			  System.out.println(res);
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
	  
	  public List<StudentVisitor> findAll(){
			List<StudentVisitor> studs = new ArrayList<>();
			List<StudentVisitor> stud =repository.findAll();
			String str=stud.get(1).getStudId();
			
			for(StudentVisitor s : stud){
				studs.add(s);
			}
			return studs;
		}
		
		public void save(StudentVisitor stud){
			repository.save(stud);
		}
		
		/*public void delete(int id){
			repository.delete(id);
		}
*/
}
