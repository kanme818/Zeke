package zeke.stage.entity;

import java.util.Date;

public class Comment {
	private Long comment_ID;
	private Long comment_article_ID;
	private String comment_author;
	private String comment_author_IP;
	private Date comment_date;
	private String comment_content;
	private String comment_approved;
	private String comment_agent;
	private String comment_type;
	private Comment replyTo;

	public Long getComment_ID() {
		return comment_ID;
	}

	public void setComment_ID(Long comment_ID) {
		this.comment_ID = comment_ID;
	}

	public Long getComment_article_ID() {
		return comment_article_ID;
	}

	public void setComment_article_ID(Long comment_article_ID) {
		this.comment_article_ID = comment_article_ID;
	}

	public String getComment_author() {
		return comment_author;
	}

	public void setComment_author(String comment_author) {
		this.comment_author = comment_author;
	}

	public String getComment_author_IP() {
		return comment_author_IP;
	}

	public void setComment_author_IP(String comment_author_IP) {
		this.comment_author_IP = comment_author_IP;
	}

	public Date getComment_date() {
		return comment_date;
	}

	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}

	public String getComment_content() {
		return comment_content;
	}

	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}

	public String getComment_approved() {
		return comment_approved;
	}

	public void setComment_approved(String comment_approved) {
		this.comment_approved = comment_approved;
	}

	public String getComment_agent() {
		return comment_agent;
	}

	public void setComment_agent(String comment_agent) {
		this.comment_agent = comment_agent;
	}

	public String getComment_type() {
		return comment_type;
	}

	public void setComment_type(String comment_type) {
		this.comment_type = comment_type;
	}

	public Comment getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(Comment replyTo) {
		this.replyTo = replyTo;
	}

}
