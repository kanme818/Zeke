package zeke.stage.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zeke.shared.entity.AppContext;
import zeke.stage.constant.StageConstant;
import zeke.stage.entity.Article;
import zeke.stage.vo.requestparameter.BaseCondition;

@Controller
@RequestMapping(value = "/page")
public class StagePageController extends BaseController {

	@RequestMapping(value = "index")
	public String showHomePage() {
		AppContext context = AppContext.getInstace(servletContext);
		int categoryId = context.getCategoryOnHomePage();
		int recordsLimited = context.getRecordsLimited();
		List<Article> articles = stageService.findArticlesByCategoryWithLimit(
				categoryId, 1, recordsLimited);
		request.setAttribute(StageConstant.RequestConstant.KEY_ARTICLES,
				articles);
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
