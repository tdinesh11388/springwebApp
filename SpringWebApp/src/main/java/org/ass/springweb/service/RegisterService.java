package org.ass.springweb.service;

import java.util.List;

import org.ass.springweb.entity.RegisterEntity;

public interface RegisterService 
{
	public void processUserInfo(RegisterEntity entity);
	
	public List<RegisterEntity> getAllUser();
}
