package kr.or.ddit.alba.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.mvc.annotation.CommandHandler;
import kr.or.ddit.mvc.annotation.HttpMethod;
import kr.or.ddit.mvc.annotation.URIMapping;

@CommandHandler
public class AlbaInsertController {

	@URIMapping("/alba/albaInsert.do")
	public String insertGet(HttpServletRequest req, HttpServletResponse resp) {
		return "alba/albaForm";
	}
	
	@URIMapping(value = "/alba/albaInsert.do", method = HttpMethod.POST)
	public String insertPost(HttpServletRequest req, HttpServletResponse resp) {
		return "alba/albaForm";
	}
}
