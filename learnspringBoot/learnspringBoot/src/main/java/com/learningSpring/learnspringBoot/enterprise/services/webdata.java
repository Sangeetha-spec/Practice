package com.learningSpring.learnspringBoot.enterprise.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class webdata {
	@Autowired
	public dataService dataservice;
	public long returnWebLayer()
	{
		return dataservice.returndataservice();
	}

}
@Component
class dataService {
	@Autowired
	public serviceLayer servicelayer;
	
	public long returndataservice()
	{
		List<Integer> data = servicelayer.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}

@Component
class serviceLayer {
	public List<Integer> getData()
	{
		return  Arrays.asList(10,23,45,66);
	}
}