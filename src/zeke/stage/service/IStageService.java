package zeke.stage.service;

import java.util.List;

import zeke.stage.entity.Article;
import zeke.stage.entity.Comment;
import zeke.stage.vo.requestparameter.ArticleSearchCondition;

public interface IStageService {
	List<Article> findArticlesByCategory(int categoryId);

	List<Article> findArticlesByCategoryWithLimit(int categoryId, int from,
			int to);

	List<Article> findArticlesByCondition(ArticleSearchCondition condition);

	List<Article> findArticlesByConditionWithLimit(
			ArticleSearchCondition condition, int from, int to);

	Article findOneArticle(int articleId);

	List<Comment> findComments(int articleId);
}
