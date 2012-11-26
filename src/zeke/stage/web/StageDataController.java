package zeke.stage.web;

import java.util.List;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zeke.stage.constant.StageConstant;
import zeke.stage.entity.Article;
import zeke.stage.vo.requestparameter.ArticleSearchCondition;

// TODO: Auto-generated Javadoc
/**
 * 前台AJAX类型请求.
 */
@Controller
@RequestMapping(value = "/data")
public class StageDataController extends BaseController {

	/**
	 * 更多该类文章.
	 * 
	 * @param condition
	 *            the condition
	 * @return the object
	 */
	@RequestMapping(value = "more")
	@ResponseBody
	public Object moreArticles(ArticleSearchCondition condition) {
		Integer categoryId = condition.getCategoryId();
		Integer page = condition.getPage();
		Integer limit = condition.getLimit();
		if (categoryId == null || page == null || limit == null) {
			return toJSONError("参数有误");
		}
		List<Article> articles = stageService.findArticlesByCategoryWithLimit(
				categoryId, page * limit + 1, limit);
		return toJSON(articles);
	}

	/**
	 * 转JSON格式.
	 * 
	 * @param resultData
	 *            the result data
	 * @return the string
	 */
	private String toJSON(Object resultData) {
		return toJSON(resultData, null);
	}

	/**
	 * 转JSON格式带参数.
	 * 
	 * @param resultData
	 *            the result data
	 * @param config
	 *            the config
	 * @return the string
	 */
	private String toJSON(Object resultData, JsonConfig config) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put(StageConstant.JSONConstant.KEY_RESULT,
				StageConstant.JSONConstant.RESULT_OK);
		jsonObj.put(StageConstant.JSONConstant.KEY_DATA, resultData);
		String resData = null;
		if (config != null) {
			resData = JSONObject.fromObject(jsonObj, config).toString();
		} else {
			JSONObject.fromObject(jsonObj).toString();
		}
		logger.debug(resData);
		return resData;
	}

	/**
	 * 转JSON格式（返回错误）.
	 * 
	 * @param errorMessage
	 *            the error message
	 * @return the string
	 */
	private String toJSONError(String errorMessage) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put(StageConstant.JSONConstant.KEY_RESULT,
				StageConstant.JSONConstant.RESULT_FAILED);
		jsonObj.put(StageConstant.JSONConstant.KEY_MESSAGE, errorMessage);
		String resData = JSONObject.fromObject(jsonObj).toString();
		logger.debug(resData);
		return resData;
	}

}
