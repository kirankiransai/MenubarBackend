package com.task.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.model.Box;

import com.task.repository.BoxRepository;

@Service
public class BoxService {
	
	@Autowired
	private BoxRepository boxRepository;
	

	
	public List<Box> getBox()
	{
		return boxRepository.findAll();
	}

}
