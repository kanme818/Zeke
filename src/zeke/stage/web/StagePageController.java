package zeke.stage.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zeke.shared.entity.AppContext;
import zeke.stage.constant.StageConstant;
import zeke.stage.entity.Article;
import zeke.stage.entity.Comment;
import zeke.stage.vo.ArticleVo;
import zeke.stage.vo.requestparameter.BaseCondition;

// TODO: Auto-generated Javadoc
/**
 * 前台页面类型请求.
 */
@Controller
@RequestMapping(value = "/page")
public class StagePageController extends BaseController {

	/**
	 * 首页.
	 * 
	 * @return the string
	 */
	@RequestMapping(value = "index")
	public String showHomePage() {
		// 获取全局配置参数
		AppContext context = AppContext.getInstace(servletContext);
		// ADMIN里配置首页显示哪个类别 ，一次显示多少条。
		int categoryId = context.getCategoryOnHomePage();
		int recordsLimited = context.getRecordsLimited();
		List<Article> articles = stageService.findArticlesByCategoryWithLimit(
				categoryId, 1, recordsLimited);
		request.setAttribute(StageConstant.Request.KEY_ARTICLES, articles);
		return "index";
	}

	/**
	 * 显示指定分类.
	 * 
	 * @param parameter
	 *            the parameter
	 * @return the string
	 */
	@RequestMapping(value = "category")
	public String showCategory(BaseCondition parameter) {
		Integer categoryId = parameter.getCategoryId();
		if (categoryId == null) {
			return "error";
		}
		Integer recordsLimited = parameter.getLimit();
		if (recordsLimited == null) {
			AppContext context = AppContext.getInstace(servletContext);
			// ADMIN里配置首页显示哪个类别 ，一次显示多少条。
			recordsLimited = context.getRecordsLimited();
		}

		List<Article> articles = stageService.findArticlesByCategoryWithLimit(
				categoryId, 1, recordsLimited);
		request.setAttribute(StageConstant.Request.KEY_ARTICLES, articles);
		return "category";
	}

	/**
	 * Show artile.
	 * 
	 * @param parameter
	 *            the parameter
	 * @return the string
	 */
	@RequestMapping(value = "article")
	public String showArticle(BaseCondition parameter) {
		Integer articleId = parameter.getArticleId();
		if (articleId == null) {
			return "/stage/jsp/error";
		}
		Article article = stageService.findOneArticle(articleId);
		if (article == null) {
			return "404";
		}

		List<Comment> comments = stageService.findComments(articleId);
		
		ArticleVo vo = new ArticleVo();
		vo.setArticle(article);
		vo.setComments(comments);
		request.setAttribute(StageConstant.Request.KEY_ONE_ARTICLE, vo);
		return "/stage/jsp/article";
	}

}
