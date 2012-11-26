package zeke.stage.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zeke.stage.service.IStageService;

@Controller
@RequestMapping(value = "/page")
public class StageDataController {

	private static final Logger logger = Logger
			.getLogger(StageDataController.class);

	@Autowired
	private IStageService stageService;

	@RequestMapping(value = "index")
	public String index() {
		logger.debug("");
		stageService.toString();
		return "index";
	}

}
