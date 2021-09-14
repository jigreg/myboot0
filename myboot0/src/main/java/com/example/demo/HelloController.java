package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/helloboot")
	public ModelAndView start() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("insa","Hello BOOT~");
		mv.setViewName("helloboot");
		return mv;
	}
}
