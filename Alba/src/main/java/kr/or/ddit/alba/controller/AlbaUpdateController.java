package kr.or.ddit.alba.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.mvc.annotation.CommandHandler;
import kr.or.ddit.mvc.annotation.HttpMethod;
import kr.or.ddit.mvc.annotation.URIMapping;

@CommandHandler
public class AlbaUpdateController {
	
	@URIMapping("/alba/alabUpdate.do")
	public String updateGet(HttpServletRequest req, HttpServletResponse resp) {
		return "alba/albaForm";
	}
	
	@URIMapping(value = "/alba/alabUpdate.do", method = HttpMethod.POST)
	public String updatePost(HttpServletRequest req, HttpServletResponse resp) {
		return null;
	}

}
