package zeke.stage.entity;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * 文章.
 */
public class Article {
	
	/** 文章元信息. */
	private ArticleMeta meta;
	
	/** 文章内容可以由多个sheet组成. */
	private List<ArticleSheet> sheets;

	/**
	 * Gets the meta.
	 *
	 * @return the meta
	 */
	public ArticleMeta getMeta() {
		return meta;
	}

	/**
	 * Sets the meta.
	 *
	 * @param meta the new meta
	 */
	public void setMeta(ArticleMeta meta) {
		this.meta = meta;
	}

	/**
	 * Gets the sheets.
	 *
	 * @return the sheets
	 */
	public List<ArticleSheet> getSheets() {
		return sheets;
	}

	/**
	 * Sets the sheets.
	 *
	 * @param sheets the new sheets
	 */
	public void setSheets(List<ArticleSheet> sheets) {
		this.sheets = sheets;
	}

}
