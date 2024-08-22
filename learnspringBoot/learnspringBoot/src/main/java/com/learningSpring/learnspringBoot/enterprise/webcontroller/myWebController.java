package com.learningSpring.learnspringBoot.enterprise.webcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * @Component public class myWebController {
 * 
 * @Autowired private DataService DataService; public long
 * returnValueFromWebController() { return
 * DataService.returnValueFromDataService(); }
 * 
 * }
 * 
 * @Component class DataService {
 * 
 * @Autowired private BusinessService BusinessService;
 * 
 * public long returnValueFromDataService() { List<Integer> data =
 * BusinessService.getData(); return data.stream().reduce(Integer::sum).get(); }
 * }
 * 
 * @Component class BusinessService {
 * 
 * public List<Integer> getData() { return Arrays.asList(11,44); } }
 */