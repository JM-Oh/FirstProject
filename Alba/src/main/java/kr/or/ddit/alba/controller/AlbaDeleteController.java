package kr.or.ddit.alba.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.mvc.annotation.CommandHandler;
import kr.or.ddit.mvc.annotation.HttpMethod;
import kr.or.ddit.mvc.annotation.URIMapping;

@CommandHandler
public class AlbaDeleteController {

	@URIMapping(value = "/alba/albaDelete.do", method = HttpMethod.POST)
	public String delete(HttpServletRequest req, HttpServletResponse resp) {
		return null;
	}
	
}
