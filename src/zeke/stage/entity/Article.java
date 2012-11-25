package zeke.stage.entity;

public class Article {
	private ArticleMeta meta;
	private ArticleData content;

	public ArticleMeta getMeta() {
		return meta;
	}

	public void setMeta(ArticleMeta meta) {
		this.meta = meta;
	}

	public ArticleData getContent() {
		return content;
	}

	public void setContent(ArticleData content) {
		this.content = content;
	}

}
