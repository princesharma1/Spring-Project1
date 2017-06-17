package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.PersonDao;
import com.entity.Person;

@Controller
public class HelloController {

	@Autowired
	PersonDao dao;

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView model = new ModelAndView();
		model.setViewName("/hello");
		return model;
	}

	@RequestMapping("/getData")
	public ModelAndView getData() {
		ModelAndView model = new ModelAndView();
		List<Person> list = dao.getAllPerson();
		System.out.println("List: " + list);
		model.addObject("list", list);
		model.setViewName("/viewData");
		return model;
	}
}
