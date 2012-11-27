package zeke.stage.entity;

// TODO: Auto-generated Javadoc
/**
 * 文章元信息.
 */
public class ArticleMeta {

	/** 是否多sheet. */
	private boolean isMultibleSheet;

	/** 指定文章的sheet组织样式. */
	private String sheetStyle;

	/**
	 * Checks if is multible sheet.
	 * 
	 * @return true, if is multible sheet
	 */
	public boolean isMultibleSheet() {
		return isMultibleSheet;
	}

	/**
	 * Sets the multible sheet.
	 * 
	 * @param isMultibleSheet
	 *            the new multible sheet
	 */
	public void setMultibleSheet(boolean isMultibleSheet) {
		this.isMultibleSheet = isMultibleSheet;
	}

	/**
	 * Gets the sheet style.
	 * 
	 * @return the sheet style
	 */
	public String getSheetStyle() {
		return sheetStyle;
	}

	/**
	 * Sets the sheet style.
	 * 
	 * @param sheetStyle
	 *            the new sheet style
	 */
	public void setSheetStyle(String sheetStyle) {
		this.sheetStyle = sheetStyle;
	}

}
