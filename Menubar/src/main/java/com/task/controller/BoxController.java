package com.task.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.task.model.Box;
import com.task.repository.BoxRepository;
import com.task.service.BoxService;

@CrossOrigin
@RestController
public class BoxController {
	
	@Autowired
	private BoxService boxService;
	@Autowired
	private BoxRepository boxrepo; 
	
	
	@PostMapping("/upload")
	public ResponseEntity<Box> uploadImage( @RequestParam("image")MultipartFile image,
			@RequestParam("country")String country,
			@RequestParam("sales")double sales,
			@RequestParam("changes") double changes) throws IOException
			
	{
		Box boxes= new Box();
		boxes.setImage((image.getBytes()));
		boxes.setCountry(country);
		boxes.setChanges(changes);
		boxes.setSales(sales);
		
	boxrepo.save(boxes);
	
		return new ResponseEntity<>(boxes,HttpStatus.OK);

	}
	
	@GetMapping("/fetchbox")
	public ResponseEntity<List<Box>> getBox()
	{
	List<Box> box=boxService.getBox();
	return ResponseEntity.ok(box);
	}
}
