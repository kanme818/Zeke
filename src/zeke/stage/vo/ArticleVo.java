package zeke.stage.vo;

import java.util.List;

import zeke.stage.entity.Article;
import zeke.stage.entity.Comment;

public class ArticleVo {
	private Article article;
	private List<Comment> comments;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
