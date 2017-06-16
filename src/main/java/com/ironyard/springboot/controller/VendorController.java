package com.ironyard.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ironyard.repo.VendorListRepository;
import com.ironyard.repo.VendorRepository;
import com.ironyard.springboot.data.Vendor;
import com.ironyard.springboot.data.VendorList;

@RestController
public class VendorController {
	
	@Autowired
	private VendorRepository myRepo;
	@Autowired
	private VendorListRepository vendorListRepo;
	
	/**
	 * Create the specified UserList
	 * @param createThis
	 * @return populated UserList
	 */
	@RequestMapping(value = "/vendorList", method = RequestMethod.POST)
	public VendorList create(@RequestBody VendorList createThis){
		vendorListRepo.save(createThis);
		return createThis;
	}
	
	/**
	 * Create the specified UserList
	 * @param createThis
	 * @return populated UserList
	 */
	@RequestMapping(value = "/vendorList", method = RequestMethod.PUT)
	public VendorList update(@RequestBody VendorList updateThis){
		vendorListRepo.save(updateThis);
		return updateThis;
	}
	
	
	/**
	 * Create the specified ToDoItem
	 * @param createThis
	 * @return populated ToDoItem
	 */
	@RequestMapping(value = "/vendor", method = RequestMethod.POST)
	public Vendor create(@RequestBody Vendor createThis){
		myRepo.save(createThis);
		return createThis;
	}
	
	/**
	 * Get the specified Item
	 * @param id
	 * @return requested ToDoItem
	 */
	@RequestMapping(value = "/vendor/{id}", method = RequestMethod.GET)
	public Vendor get(@PathVariable Long id){
		// set ID
		return myRepo.findOne(id);
	}
	
	/**
	 * 
	 * @return Collection of all ToDoItems
	 */
	@RequestMapping(value = "/vendor", method = RequestMethod.GET)
	public Page get(@RequestParam("page") Integer page,
            @RequestParam("size") Integer size,
            @RequestParam(value = "sortby", required = false) String sortby,
            @RequestParam(value = "dir", required = false) Sort.Direction direction) {

		
		// DEFAULT Sort property
		if (sortby == null) {
			sortby = "title";
		}
		
		// DEFAULT Sort direction
		if (direction == null) {
			direction = Sort.Direction.DESC;
		}
		
		Sort s = new Sort(direction, sortby);
		PageRequest pr = new PageRequest(page, size, s);
		Page data =  myRepo.findAll(pr);		
		return data;
	}
	
	
}
