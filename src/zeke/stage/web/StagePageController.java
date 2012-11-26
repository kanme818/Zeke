package zeke.stage.web;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zeke.shared.entity.AppContext;
import zeke.stage.constant.IStageConstant;
import zeke.stage.entity.Article;
import zeke.stage.service.IStageService;
import zeke.stage.vo.requestparameter.BaseCondition;

@Controller
@RequestMapping(value = "/page")
public class StagePageController {

	private static final Logger logger = Logger
			.getLogger(StagePageController.class);

	@Autowired
	private IStageService stageService;

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private HttpSession session;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = "index")
	public String index() {
		AppContext context = AppContext.getInstace(servletContext);
		int categoryId = context.getCategoryOnHomePage();
		int recordsLimited = context.getRecordsLimited();
		List<Article> articles = stageService.findArticlesByCategoryWithLimit(
				categoryId, 0, recordsLimited);
		request.setAttribute(IStageConstant.ARTICLES, articles);
		return "index";
	}

	@RequestMapping(value = "category")
	public String showCategory(BaseCondition parameter) {
		logger.debug("");
		stageService.toString();
		return "category";
	}

	@RequestMapping(value = "article")
	public String showArtile(BaseCondition parameter) {
		logger.debug("");
		stageService.toString();
		return "article";
	}

}
