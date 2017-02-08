package com.yj.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value="/member/login",method=RequestMethod.GET )
	public String loginForm(){
		return".member.login";
	}
	@RequestMapping(value="/member/login",method=RequestMethod.POST )
	public String login(HttpServletRequest req){
		
		System.out.println("loginController도착!!!!!");
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		System.out.println("id==="+id);
		System.out.println("pwd==="+pwd);
		if(id.equals("song")&& pwd.equals("1234")){
			req.getSession().setAttribute("id", id);
			return "redirect:/";
		}else{
			req.setAttribute("errMsg", "세션이없다");
			return ".login";
		}
	}
}
