package com.ezen.eure;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {
	@Autowired
	SqlSession sqlSession;
	
	
	@RequestMapping(value = "/")
	public String main(HttpServletRequest request, Model mo) {
		HttpSession hs = request.getSession();
		hs.setAttribute("loginstate", false);
		
		
		
		return "main";
	}
	
	@RequestMapping(value="/index")
	public String ko4() {
		
		
		return "main";
	}
	
	@RequestMapping(value="/Joininput")
	public String join() {
		
		
		
		return "Joininput";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String hc2(HttpServletRequest request) {
		
		String name=request.getParameter("name");
		String sb=request.getParameter("sb");
		String address=request.getParameter("address");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String email=request.getParameter("email");
		String birth=request.getParameter("birth");
		String tel=request.getParameter("tel");
		Service ser= sqlSession.getMapper(Service.class);
		ser.insert(name, sb, address, id, pw, email, birth, tel);
		return "login";
	}
	
	@RequestMapping(value="/logingo")
	public String logingo()
	{
		return "login";
	}
	

	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,  RedirectAttributes ra) {
		ModelAndView mav = new ModelAndView();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		Service ser = sqlSession.getMapper(Service.class);
		LoginDTO dto = ser.login(id,pw, email);
		AdminDTO dto2 = ser.login2(id,pw);
		if(dto!=null)
		{
			HttpSession hs = request.getSession();
			hs.setAttribute("member", dto);
			hs.setAttribute("loginstate", true);
			hs.setMaxInactiveInterval(300);
			mav.setViewName("redirect:index");
		}
		else if(dto2!=null)
		{
			HttpSession hs = request.getSession();
			hs.setAttribute("admin1", dto);
			hs.setAttribute("adminstate", true);
			hs.setMaxInactiveInterval(300);
			mav.setViewName("redirect:index");
		}
		else 
		{
			ra.addAttribute("result","loginfail");
			mav.setViewName("redirect:logingo");
		}
		return mav;
	}
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request)
	{
		HttpSession hs =request.getSession();
		hs.removeAttribute("member");
		hs.removeAttribute("loginstate");
		hs.setAttribute("loginstate", false);
		hs.removeAttribute("admin1");
		hs.removeAttribute("adminstate");
		hs.setAttribute("adminstate", false);
		return "redirect:index";
	}
	

}
