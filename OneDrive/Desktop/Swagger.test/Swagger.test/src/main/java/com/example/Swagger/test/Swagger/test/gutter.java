package com.example.Swagger.test.Swagger.test;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gutter {	
	
	 @Autowired
	public MessageSource messageSource;

	
	public  NewClas clas;
	public gutter(NewClas clas) {
		super();
		this.clas = clas;
	}
	@GetMapping("/rest")
	public List<Voters> findAll()
	{
		return clas.fetch();
	}
	
	@GetMapping("/findOne/{id}")
	public Voters fetchOne(@PathVariable  int id)
	{
		 return clas.findOne(id);
	}
	@PostMapping("/postmsg")
	public void save(Voters votr)
	{
		clas.post(votr);	
	}
	
	@GetMapping(path="/messages")
	public String message()
	{
		Locale locale= LocaleContextHolder.getLocale();
		
		return messageSource.getMessage("good.morning.message.spanish", null, "Default Message", locale);
		 
	}
	/*
	 * @GetMapping(path="/spanish") public String Spanish() { Locale locale=
	 * LocaleContextHolder.getLocale(); return
	 * messageSource.getMessage("good.morning.message.spanish", null,
	 * "Default Message", locale); }
	 */
}
