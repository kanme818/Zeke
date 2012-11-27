package zeke.stage.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zeke.stage.entity.Article;
import zeke.stage.entity.ArticleMeta;
import zeke.stage.entity.Comment;
import zeke.stage.vo.requestparameter.ArticleSearchCondition;

@Service
@Transactional(readOnly=false)
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

	@Override
	public Article findOneArticle(int articleId) {
		Article article = new Article();
		ArticleMeta meta = new ArticleMeta();
		meta.setMultibleSheet(true);
		meta.setSheetStyle("/theme/default/js/article-style-default.js");
		article.setMeta(meta);
		return article;
	}

	@Override
	public List<Comment> findComments(int articleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
