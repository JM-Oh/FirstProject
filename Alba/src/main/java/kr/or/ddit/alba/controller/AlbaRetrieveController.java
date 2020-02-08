package kr.or.ddit.alba.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.mvc.annotation.CommandHandler;
import kr.or.ddit.mvc.annotation.URIMapping;

@CommandHandler
public class AlbaRetrieveController {
	
	@URIMapping("/alba/albaList.do")
	public String list(HttpServletRequest req, HttpServletResponse resp) {
		return "alba/albaList";
	}
	
	@URIMapping("/alba/albaView.do")
	public String view(HttpServletRequest req, HttpServletResponse resp) {
		return "alba/albaView";
	}

}
