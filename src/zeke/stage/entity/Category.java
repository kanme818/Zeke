package zeke.stage.entity;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Category.
 */
public class Category {

	/** The category id. */
	private String categoryId;

	/** The category name. */
	private String categoryName;

	/** The artiles. */
	private List<Article> artiles;

	/**
	 * Gets the category id.
	 * 
	 * @return the category id
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * Sets the category id.
	 * 
	 * @param categoryId
	 *            the new category id
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * Gets the category name.
	 * 
	 * @return the category name
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Sets the category name.
	 * 
	 * @param categoryName
	 *            the new category name
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * Gets the artiles.
	 * 
	 * @return the artiles
	 */
	public List<Article> getArtiles() {
		return artiles;
	}

	/**
	 * Sets the artiles.
	 * 
	 * @param artiles
	 *            the new artiles
	 */
	public void setArtiles(List<Article> artiles) {
		this.artiles = artiles;
	}

}
