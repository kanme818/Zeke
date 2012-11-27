package zeke.stage.entity;

// TODO: Auto-generated Javadoc
/**
 * 文章sheet.
 */
public class ArticleSheet {

	/** The sheet id. */
	private Integer sheetId;

	/** 文章id. */
	private Integer articleId;

	/** The sheet name. */
	private String sheetName;

	/** sheet内容 . */
	private String content;

	/** 是否启用. */
	private boolean isActive;

	/**
	 * Gets the sheet id.
	 * 
	 * @return the sheet id
	 */
	public Integer getSheetId() {
		return sheetId;
	}

	/**
	 * Sets the sheet id.
	 * 
	 * @param sheetId
	 *            the new sheet id
	 */
	public void setSheetId(Integer sheetId) {
		this.sheetId = sheetId;
	}

	/**
	 * Gets the article id.
	 * 
	 * @return the article id
	 */
	public Integer getArticleId() {
		return articleId;
	}

	/**
	 * Sets the article id.
	 * 
	 * @param articleId
	 *            the new article id
	 */
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	/**
	 * Gets the sheet name.
	 * 
	 * @return the sheet name
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * Sets the sheet name.
	 * 
	 * @param sheetName
	 *            the new sheet name
	 */
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	/**
	 * Gets the content.
	 * 
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content.
	 * 
	 * @param content
	 *            the new content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Checks if is active.
	 * 
	 * @return true, if is active
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * Sets the active.
	 * 
	 * @param isActive
	 *            the new active
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
