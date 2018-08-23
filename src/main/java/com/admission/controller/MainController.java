package com.admission.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.admission.model.StaffInfo;
import com.admission.model.StudBookingLog;
import com.admission.model.StudentEnquiry;
import com.admission.model.StudentVisitor;
import com.admission.service.BookingSeatService;
import com.admission.service.StaffInfoService;
import com.admission.service.StudentEnquiryService;
import com.admission.service.StudentVisitorService;

/**
 * @author ${Vijay Gupta}
 *
 * Aug 9, 2017
 */
@RestController
@RequestMapping("jpa/v1")
public class MainController {

	@Autowired
	StudentEnquiryService studentenquiryService;
	
	@Autowired
	StudentVisitorService studentvisitorService;
	
	@Autowired
	StaffInfoService staffinfoService;
	
	@Autowired
	BookingSeatService bookingseatService;
	
	
	
	@PostMapping(value="/StudEnq", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String StudEnq(@RequestBody StudentEnquiry stud,BindingResult bindingResult){
		System.out.println("Save Task$R" + stud.toString());
		String l= studentenquiryService.studEnq(stud);
		stud.setCcbUid(l);
		studentenquiryService.save(stud);
		return "Task Saved";
	}
	
	@PostMapping(value="/StudVisit", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String StudVisit(@RequestBody StudentVisitor studv,BindingResult bindingResult){
		System.out.println("Save Task$R" + studv.toString());
		String l= studentvisitorService.studVisit(studv);
		studv.setStudId(l);
		System.out.println("Save Task$R" + studv.toString());
		String m= studentvisitorService.findStaff(studv);
		studv.setStaffId(m);
		System.out.println("Save Task$R" + studv.toString());
		studentvisitorService.save(studv);
		return "Task Saved";
	}
	
	@PostMapping(value="/BookSeat", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String BookSeat(@RequestBody StudBookingLog bseat,BindingResult bindingResult){
		System.out.println("Save Task$R" + bseat.toString());
		String l= bookingseatService.fetchStuid(bseat);
		bseat.setStudUid(l);
		System.out.println("Save Task$R" + bseat.toString());
		 l= bookingseatService.fetchAguid(bseat);
		bseat.setAgentUid(l);
		System.out.println("Save Task$R" + bseat.toString());
		 l= bookingseatService.fetchStauid(bseat);
		bseat.setStaffUid(l);
		System.out.println("Save Task$R" + bseat.toString());
		
		bookingseatService.save(bseat);
		return "Task Saved";
	} 
	
	@RequestMapping(value="/allStaff", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List allStaffs(){
		return staffinfoService.findAll();
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-mm-dd"),false));
	}
	
	@PutMapping(value="/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String saveTask(@RequestBody StudentEnquiry stud,BindingResult bindingResult){
		System.out.println("Save Task$R" + stud.toString());
		studentenquiryService.save(stud);
		return "Task Saved..";
	}
	
	@RequestMapping(value="/allStuds", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<StudentEnquiry> allStuds(){
		List<StudentEnquiry> stu=new ArrayList<>();
		for(StudentEnquiry q :studentenquiryService.findAll()){
			String qq=null;
		}
		
		return studentenquiryService.findAll();
	}
	
	@RequestMapping(value="/showStudVisit", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<StudentVisitor> StudentVisitors(){
		List<StudentVisitor> stu=new ArrayList<>();
		for(StudentVisitor q : studentvisitorService.findAll()){
			q.setStaffName(staffinfoService.findStaffNameById(q.getStaffId()));
			q.setName(studentenquiryService.findNameById(q.getStudId()));
			stu.add(q);
		}
		System.out.println(stu.toString());
		return stu;
	}
	
	
	@DeleteMapping("/delete/{id}" )
	@ResponseBody
	public String deleteTask(@PathVariable final int id){
		studentenquiryService.delete(id);
		return "Task Deleted..";
	}
	
	@RequestMapping("/update/{id}")
	@ResponseBody
	public String updateTask(@RequestBody StudentEnquiry stud,@PathVariable final int id){
		studentenquiryService.save(stud);
		return "Task Updated..";
	}
}

