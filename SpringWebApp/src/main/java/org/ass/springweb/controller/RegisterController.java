package org.ass.springweb.controller;

import org.ass.springweb.Dto.RegisterDto;
import org.ass.springweb.entity.RegisterEntity;
import org.ass.springweb.service.impl.RegisterServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Component
@Controller
public class RegisterController 
{
	
	@Autowired
	private RegisterServiceImp registerServiceImp;
	
	@RequestMapping(value = "/saveUserDetails")
	public ModelAndView saveUserDetails(RegisterEntity registerEntity)
	{
		System.out.println(registerEntity);
		registerServiceImp.processUserInfo(registerEntity);
		return new ModelAndView("index.jsp");
	}
	 
}
