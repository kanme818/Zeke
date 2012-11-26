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

@Controller
@RequestMapping(value = "/data")
public class StageDataController extends BaseController {

	@RequestMapping(value = "more")
	@ResponseBody
	public Object moreArticles(ArticleSearchCondition condition) {
		List<Article> articles = stageService.findArticlesByCategoryWithLimit(
				condition.getCategoryId(),
				condition.getPage() * condition.getLimit() + 1,
				condition.getLimit());
		return toJSON(articles);
	}

	private String toJSON(Object resultData) {
		return toJSON(resultData, null);
	}

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
