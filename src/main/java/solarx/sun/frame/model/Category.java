/**
 * @Title: Category.java
 * @Package solarx.sun.frame.model
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 孙雷
 * @date: 2019年7月6日 下午8:43:47
 * @version V1.0
 */
package solarx.sun.frame.model;

/**
 * @ClassName: Category
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: 孙雷
 * @date: 2019年7月6日 下午8:43:47
 * 
 */
public class Category {
	private Integer id;
	private Integer type;
	private String name;
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
	 * @Title: getType <BR>
	 * @Description: please write your description <BR>
	 * @return: Integer <BR>
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * @Title:  setType <BR>
	 * @Description: please write your description <BR>
	 * @return: Integer <BR>
	 */
	public void setType(Integer type) {
		this.type = type;
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
}
