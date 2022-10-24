package com.klef.jfsd.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Doctor;
import com.klef.jfsd.springboot.model.Receptionist;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.DoctorService;
import com.klef.jfsd.springboot.service.ReceptionistService;

@Controller
public class ClientController {
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private ReceptionistService receptionistService;
	
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		
		return mv;
	}
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		
		return mv;
	}
	@GetMapping("/viewalldocs")
	public ModelAndView viewalldocsdemo()
	{
		ModelAndView mv = new ModelAndView("viewalldoctors");
		
		List<Doctor> emplist = adminService.viewalldoc();
		mv.addObject("emplist",emplist);
		
		return mv;
	}
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String duname = request.getParameter("duname");
		String apwd = request.getParameter("apwd");
		
		Admin admin = adminService.checkadminlogin(duname, apwd);
		
		if(admin!=null)
		{
			
			HttpSession session = request.getSession();
			
			session.setAttribute("duname", duname);
			
			mv.setViewName("adminhome");
		}
		else
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	
	@GetMapping("/doctorhome")
	public ModelAndView doctorhomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("doctorhome");
		
		HttpSession session = request.getSession();
		
		String duname = (String) session.getAttribute("duname");
		
		mv.addObject("duname", duname);
		
		return mv;
	}
	
	@PostMapping("/checkdoclogin")
	public ModelAndView checkdoclogindemo(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		
		String duname = request.getParameter("duname");
		String epwd = request.getParameter("epwd");
		
		Doctor emp = doctorService.checkdoclogin(duname, epwd);
		
		if(emp!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("duname", duname);
			
			mv.setViewName("doctorhome");
		}
		else
		{
			mv.setViewName("doctorlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		
		return mv;
	}
	@GetMapping("/doctorreg")
	public ModelAndView doctorregdemo()
	{
		ModelAndView mv = new ModelAndView("doctorregistration", "emp",new Doctor());
		return mv;
	}
	@GetMapping("/doctorlogin")
	public ModelAndView doctorogindemo()
	{
		ModelAndView mv = new ModelAndView("doctorlogin");
		
		return mv;
	}
	
	@PostMapping("/adddoctor")
	public String adddocdemo(@ModelAttribute("emp") Doctor doc)
	{
		doctorService.adddoc(doc);
		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("employeeregistration");
//		mv.addObject("msg", "Employee Registered Successfully");
		
		return "redirect:doctorlogin";
	}
	@GetMapping("/echangepwd")
	public ModelAndView echangepwd(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String duname = (String) session.getAttribute("duname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("docchangepwd");
		mv.addObject("duname",duname);
		
		return mv;
	}
	@GetMapping("/viewdoc")
	public ModelAndView viewemp(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String duname = (String) session.getAttribute("duname");
		
		Doctor emp =  doctorService.viewdoc(duname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewdoctor");
		mv.addObject("emp",emp);
		
		return mv;
	}
	@GetMapping("/deletedoc")
	public String deleteempdemo(@RequestParam("id") int eid)
	{
		adminService.deletdoc(eid);
		
		return "redirect:viewalldoctorss";
	}
	@GetMapping("/viewempbyid")
	public ModelAndView viewempbyiddemo(@RequestParam("id") int eid)
	{
		Doctor emp = adminService.viewdocbyid(eid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewdocbyid");
		mv.addObject("emp",emp);
		
		return mv;
	}
	@PostMapping("/updatedocpwd")
	public ModelAndView updateemppwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("docchangepwd");
		
		HttpSession session = request.getSession();
		
		String duname = (String) session.getAttribute("duname");
		
		String eoldpwd = request.getParameter("eopwd");
		String enewpwd = request.getParameter("enpwd");
		
		int n = doctorService.changedocpassword(eoldpwd, enewpwd, duname);
		
		if(n > 0)
		{
			
			mv.addObject("msg","Password Updated Successfully");
		}
		else
		{
			mv.addObject("msg","Old Password is Incorrect");
		}
		
		return mv;
	}
	
	@PostMapping("/addrec")
	public String addrecdemo(@ModelAttribute("rec") Receptionist rec)
	{
		receptionistService.addrec(rec);
		

		
		return "redirect:adminhome";
	}
	@GetMapping("/recreg")
	public ModelAndView recregdemo()
	{
		ModelAndView mv = new ModelAndView("receptionistregistration", "rec",new Receptionist());
		return mv;
	}
}
