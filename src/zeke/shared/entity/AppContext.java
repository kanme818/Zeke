package zeke.shared.entity;

import javax.servlet.ServletContext;

import zeke.shared.constant.AppConstant;

// TODO: Auto-generated Javadoc
/**
 * The Class GlobalContext.
 */
public class AppContext {
	
	/** The category on home page. */
	private int categoryOnHomePage = 0;
	
	/** The records limited. */
	private int recordsLimited = 10;

	/** The instance. */
	private static AppContext instance = new AppContext();
	
	

	/**
	 * Instantiates a new global context.
	 */
	private AppContext() {
		super();
	}

	/**
	 * Gets the instace.
	 *
	 * @return the instace
	 */
	public static AppContext getInstace() {
		return instance;
	}

	/**
	 * Gets the instace.
	 *
	 * @param servletContext the servlet context
	 * @return the instace
	 */
	public static AppContext getInstace(ServletContext servletContext) {
		return (AppContext) servletContext.getAttribute(AppConstant.KEY_APPCONTEXT);
	}

	/**
	 * Gets the category on home page.
	 *
	 * @return the category on home page
	 */
	public int getCategoryOnHomePage() {
		return categoryOnHomePage;
	}

	/**
	 * Sets the category on home page.
	 *
	 * @param categoryOnHomePage the new category on home page
	 */
	public void setCategoryOnHomePage(int categoryOnHomePage) {
		this.categoryOnHomePage = categoryOnHomePage;
	}

	/**
	 * Gets the records limited.
	 *
	 * @return the records limited
	 */
	public int getRecordsLimited() {
		return recordsLimited;
	}

	/**
	 * Sets the records limited.
	 *
	 * @param recordsLimited the new records limited
	 */
	public void setRecordsLimited(int recordsLimited) {
		this.recordsLimited = recordsLimited;
	}

}
