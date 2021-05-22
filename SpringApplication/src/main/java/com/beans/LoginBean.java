package com.beans;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginBean {
	@RequestMapping(value = "/login")
	public String init(Model model,@ModelAttribute("login") Login loginBean) {
		if(loginBean != null && loginBean.getUname() != null & loginBean.getPassword()!= null) {
			if(loginBean.getUname().equals("Bhargavi") && loginBean.getPassword().equals("ojas")) {
				model.addAttribute("msg",loginBean.getUname());
				return "Success";
			}else {
				model.addAttribute("error","Invalid Details");
	            return "Error";
			}
		
		} else {
			model.addAttribute("error","Please enter Details");
			return "Login";
		}
		
			
	}
	
	  
}
