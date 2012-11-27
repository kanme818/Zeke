package zeke.stage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import zeke.stage.entity.Article;
import zeke.stage.entity.ArticleMeta;
import zeke.stage.entity.ArticleSheet;
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
		meta.setSheetStyle("/theme/default/js/article-style-multible-sheet.js");
		article.setMeta(meta);
		
		ArticleSheet sheet1= new ArticleSheet();
		sheet1.setContent("<p>a p/ </p>");
		
		ArticleSheet sheet2= new ArticleSheet();
		sheet2.setContent("<a href='#'>an a/</a>");
		
		ArticleSheet sheet3= new ArticleSheet();
		sheet3.setContent("<span>a span</span>");
		
		ArticleSheet sheet4= new ArticleSheet();
		sheet4.setContent("<img src='http://www.baidu.com/img/baidu_jgylogo3.gif'>an img/</p>");
		
		List<ArticleSheet> sheets = new ArrayList<ArticleSheet>();
		sheets.add(sheet1);
		sheets.add(sheet2);
		sheets.add(sheet3);
		sheets.add(sheet4);
		
		article.setSheets(sheets);
		return article;
	}

	@Override
	public List<Comment> findComments(int articleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
