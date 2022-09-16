package com.ezen.board;

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

import com.ezen.eure.AdminDTO;
import com.ezen.eure.LoginDTO;
import com.ezen.eure.Service;


@Controller
public class BoardController {
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping(value="/qs")
	public String qs(HttpServletRequest request, RedirectAttributes ra)
	{
        HttpSession hs=request.getSession();
        if(hs.getAttribute("loginstate").equals(true))
        {
        return "onenotice";
        }
        else
        {
           return "redirect:logingo2";
        }
	}
	
	@RequestMapping(value="/logingo2")
	public String logingo()
	{
		return "loginnotice";
	}

	
	@RequestMapping(value="/login2",method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,  RedirectAttributes ra) {
		ModelAndView mav = new ModelAndView();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		Service ser = sqlSession.getMapper(Service.class);
		LoginDTO dto = ser.login(id,pw);
		if(dto!=null)
		{
			HttpSession hs = request.getSession();
			hs.setAttribute("member", dto);
			hs.setAttribute("loginstate", true);
			hs.setMaxInactiveInterval(300);
			mav.setViewName("onenotice");
		}
		else 
		{
			ra.addAttribute("result","loginfail");
			mav.setViewName("redirect:logingo2");
		}
		return mav;
	}
	
	@RequestMapping(value="/question")
	public String email(HttpServletRequest request, Model mo)
	{
		String email = request.getParameter("email");
		Service ser = sqlSession.getMapper(Service.class);
		LoginDTO dto = ser.email(email);
		mo.addAttribute("dto",dto);
		return "onenotice";
	}
	
	
}
