package zeke.stage.web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import zeke.stage.service.IStageService;

public abstract class BaseController {

	protected Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	protected IStageService stageService;

	@Autowired
	protected ServletContext servletContext;

	@Autowired
	protected HttpSession session;

	@Autowired
	protected HttpServletRequest request;

}
