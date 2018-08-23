package com.admission.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admission.dao.BookingSeatRepository;
import com.admission.dao.StudentEnquiryRepository;
import com.admission.model.StudBookingLog;
import com.admission.model.StudentEnquiry;

@Service
@Transactional
public class BookingSeatService {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	BookingSeatRepository repository;
	
	public BookingSeatService(BookingSeatRepository repository){
		this.repository=repository;
	}
	
	Query query=null;
		
		public String fetchStuid(StudBookingLog bookseat){
			String res=null;
		    query=em.createNativeQuery("Select se.uid from Stud_Enquiry se where se.name= :name");
			 query.setParameter("name",bookseat.getName());
			 System.out.println("After typed query1");
			  List q=query.getResultList();
			  for (Object p : q) {
				  res=  printResult(p);
			  }
			return res;
			  
		}
		
		
		
		public String fetchAguid(StudBookingLog bookseat){
			String res=null;
			query= em.createNativeQuery("Select uid from agent_info where name= :agentName");
		     query.setParameter("agentName",bookseat.getAgentName());
			 System.out.println("After typed query2");
			  List q=query.getResultList();
			  for (Object p : q) {
				  res=  printResult(p);
			  }
			return res;
			  
		}
		
		
		
		
		public String fetchStauid(StudBookingLog bookseat){
			String res=null;
			 query= em.createNativeQuery("Select uid from staff_info where name= :sname");
			 query.setParameter("sname",bookseat.getSname());
			 System.out.println("After typed query3");
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
		
		
		
		public void save(StudBookingLog bookseat){
			repository.save(bookseat);
		}

}
