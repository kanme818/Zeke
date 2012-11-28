/*
 * Created by Yong.Kan @2012-11-27
 */
package zeke.stage.entity;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * 文章元信息.
 */
public class ArticleMeta {

	/** The id. */
	private Integer id;

	/** 文章类型. */
	private Integer articleType;

	/** The author id. */
	private Integer authorId;

	/** The title. */
	private String title;

	/** draft, publish, unopened, obsolete. */
	private Integer status;

	/** The category. */
	private Integer categoryId;

	/** 该文章的连接（不加域名，只取相对地址）. */
	private String link;

	/** 连接（包括域名，为SEO）. */
	private String fullLink;

	/** The last modified. */
	private Date lastModified;

	/** open, closed(关闭评论，但是原评论可见), hidden（隐藏所有评论）. */
	private Integer commentStatus;

	/** The comment count. */
	private Integer commentCount;

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the article type.
	 * 
	 * @return the article type
	 */
	public Integer getArticleType() {
		return articleType;
	}

	/**
	 * Sets the article type.
	 * 
	 * @param articleType
	 *            the new article type
	 */
	public void setArticleType(Integer articleType) {
		this.articleType = articleType;
	}

	/**
	 * Gets the author id.
	 * 
	 * @return the author id
	 */
	public Integer getAuthorId() {
		return authorId;
	}

	/**
	 * Sets the author id.
	 * 
	 * @param authorId
	 *            the new author id
	 */
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 * 
	 * @param title
	 *            the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the status.
	 * 
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 * 
	 * @param status
	 *            the new status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * Gets the category id.
	 * 
	 * @return the category id
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * Sets the category id.
	 * 
	 * @param categoryId
	 *            the new category id
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Gets the link.
	 * 
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * Sets the link.
	 * 
	 * @param link
	 *            the new link
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * Gets the full link.
	 * 
	 * @return the full link
	 */
	public String getFullLink() {
		return fullLink;
	}

	/**
	 * Sets the full link.
	 * 
	 * @param fullLink
	 *            the new full link
	 */
	public void setFullLink(String fullLink) {
		this.fullLink = fullLink;
	}

	/**
	 * Gets the last modified.
	 * 
	 * @return the last modified
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * Sets the last modified.
	 * 
	 * @param lastModified
	 *            the new last modified
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * Gets the comment status.
	 * 
	 * @return the comment status
	 */
	public Integer getCommentStatus() {
		return commentStatus;
	}

	/**
	 * Sets the comment status.
	 * 
	 * @param commentStatus
	 *            the new comment status
	 */
	public void setCommentStatus(Integer commentStatus) {
		this.commentStatus = commentStatus;
	}

	/**
	 * Gets the comment count.
	 * 
	 * @return the comment count
	 */
	public Integer getCommentCount() {
		return commentCount;
	}

	/**
	 * Sets the comment count.
	 * 
	 * @param commentCount
	 *            the new comment count
	 */
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

}
