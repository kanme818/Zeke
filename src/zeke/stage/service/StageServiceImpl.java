package zeke.stage.service;

import java.util.List;

import zeke.stage.entity.Article;
import zeke.stage.vo.requestparameter.ArticleSearchCondition;

public class StageServiceImpl implements IStageService {

	@Override
	public List<Article> findArticlesByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findArticlesByCategoryWithLimit(int categoryId,
			int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findArticlesByCondition(
			ArticleSearchCondition condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findArticlesByConditionWithLimit(
			ArticleSearchCondition condition, int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

}
