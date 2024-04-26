package com.green.evalBbs.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.evalBbs.dao.IEvalBbsDao;
import com.green.evalBbs.dto.EvalBbsDto;

@Controller
public class MyController {

	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	@Autowired
	private IEvalBbsDao dao;
	
	@GetMapping("/list")
	public String list(Model model) {

		model.addAttribute("list", dao.getList());
		return "list";
	}
	
	@GetMapping("/detail")
	public String getOneList(@RequestParam("bno") int bno, Model model) {
		
		model.addAttribute("list", dao.getOneList(bno));
		return "detail";
	}
	
	@GetMapping("/writeForm")
	public String writeForm() {
		
		return "writeForm";
	}
	
	@PostMapping("/write")
	public String write(@RequestParam("title") String title, @RequestParam("content") String content,
			@RequestParam("writer") String writer, @RequestParam("regdate") Date regdate) {
		System.out.println(title);
		dao.write(title, content, writer, regdate);
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("bno") int bno) {
		dao.delete(bno);
		return "redirect:list";
	}
	
	
}
