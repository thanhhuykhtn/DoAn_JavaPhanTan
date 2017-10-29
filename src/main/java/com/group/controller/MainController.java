package com.group.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping({"/","/home.html","/index.html"})
	public String home(Model model) {
		return "index";
	}
	
	@RequestMapping("/about.html")
	public String about(Model model) {
		return "about";
	}
	
	@RequestMapping("/codes.html")
	public String codes(Model model) {
		return "codes";
	}
	
	@RequestMapping("/gallery.html")
	public String gallery(Model model) {
		return "gallery";
	}
	
	@RequestMapping("/icons.html")
	public String icons(Model model) {
		return "icons";
	}
	
	@RequestMapping("/single.html")
	public String single(Model model) {
		return "single";
	}
	
	@RequestMapping("/contact.html")
	public String contact(Model model) {
		return "contact";
	}
	
	@RequestMapping("/danhsachmonan.html")
	public String danhsachmonan(Model model) {
		return "danhsachmonan";
	}
	
	@RequestMapping("/danhsachchinhanh.html")
	public String danhsachchinhanh(Model model) {
		return "danhsachchinhanh";
	}
	
	@RequestMapping("/giohang.html")
	public String giohang(Model model) {
		return "giohang";
	}
	
	@RequestMapping("/lichsudonhang.html")
	public String lichsudonhang(Model model) {
		return "lichsudonhang";
	}
	
	@RequestMapping("/timkiemmonan.html")
	public String timkiemmonan(Model model) {
		return "timkiemmonan";
	}
}
