package com.axsos.OmikujiForm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/omikuji")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/omikuji/show")
	public String show(
			@RequestParam(value="numberInput") String numberInput ,
			@RequestParam(value="cityName") String cityName	,
			@RequestParam(value="personName") String personName ,
			@RequestParam(value="hobby") String hobby ,
			@RequestParam(value="livingType") String livingType ,
			@RequestParam(value="niceNote") String niceNote ,
			HttpSession session
			) {
		session.setAttribute("numberInput", numberInput);
		session.setAttribute("cityName", cityName);
		session.setAttribute("personName", personName);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingType", livingType);
		session.setAttribute("niceNote", niceNote);
		return "show";
	}
	
	
}
