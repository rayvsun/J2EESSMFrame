/**
 * @Title: Product.java
 * @Package solarx.sun.frame.model
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 孙雷
 * @date: 2019年7月6日 下午8:44:16
 * @version V1.0
 */
package solarx.sun.frame.model;

/**
 * @ClassName: Product
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: 孙雷
 * @date: 2019年7月6日 下午8:44:16
 * 
 */
public class Product {
	private Integer id;
	private String name;
	private Float price;
	private Category category;
	/**
	 * @Title: getId <BR>
	 * @Description: please write your description <BR>
	 * @return: Integer <BR>
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @Title:  setId <BR>
	 * @Description: please write your description <BR>
	 * @return: Integer <BR>
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @Title: getName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getName() {
		return name;
	}
	/**
	 * @Title:  setName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @Title: getPrice <BR>
	 * @Description: please write your description <BR>
	 * @return: Float <BR>
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * @Title:  setPrice <BR>
	 * @Description: please write your description <BR>
	 * @return: Float <BR>
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * @Title: getCategory <BR>
	 * @Description: please write your description <BR>
	 * @return: Category <BR>
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @Title:  setCategory <BR>
	 * @Description: please write your description <BR>
	 * @return: Category <BR>
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
}
