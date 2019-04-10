package com.example.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class commonExceptionHandler {
	private static final Log LOG = LogFactory.getLog( commonExceptionHandler.class );
	
	@ExceptionHandler(Exception.class)
	public ModelAndView commonException(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e);
		mv.setViewName("error");
		return mv;
	}
}
