package org.ass.springweb.service.impl;

import java.util.List;

import org.ass.springweb.Repository.RegisterRepository;
import org.ass.springweb.entity.RegisterEntity;
import org.ass.springweb.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImp implements RegisterService
{
	@Autowired
	private RegisterRepository registerRepository;
	
	@Override 
	public void processUserInfo(RegisterEntity entity) 
	{
		registerRepository.saveUser(entity);
	}

	@Override
	public List<RegisterEntity> getAllUser() 
	{
		return registerRepository.findAllUser();
	}

}
