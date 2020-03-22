package com.test.test.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/*
 * - DispatcherServlet�� ��ûcommand�� 1���������ϴ� ��ü
 * - DispatcherServlet�� �̰�ü�Ǹ޽�带 ȣ���ؼ� ��������  
 * - DispatcherServlet���� forwardPath�� ��ȯ 
 */
public class GuestMainController implements Controller {
	public GuestMainController() {
		System.out.println("### GuestMainController() ������");
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("### GuestMainController : handleRequest() �޽�� ȣ��");
		String forwardPath = "";
		forwardPath = "forward:/WEB-INF/views/guest_main.jsp";
		ModelAndView mv=new ModelAndView();
		mv.setViewName(forwardPath);
		return mv;
	}
}