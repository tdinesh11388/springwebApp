package org.ass.springweb.controller;

import java.util.List;

import org.ass.springweb.entity.RegisterEntity;
import org.ass.springweb.service.impl.RegisterServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterRestController 
{
	@Autowired
	private RegisterServiceImp registerServiceImp;
	
	@GetMapping(value="/getAllUser")
	public @ResponseBody List<RegisterEntity>getAllUser()
	{
		return registerServiceImp.getAllUser();
	}
	
	@PostMapping(value="/saveRegisterDetails")
	public void saveRegisterDetails(@RequestBody RegisterEntity registerEntity)
	{
		registerServiceImp.processUserInfo(registerEntity);
	}

}
