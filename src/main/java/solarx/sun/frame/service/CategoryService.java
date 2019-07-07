/**
 * @Title: CategoryService.java
 * @Package solarx.sun.frame.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 孙雷
 * @date: 2019年7月7日 上午9:02:31
 * @version V1.0
 */
package solarx.sun.frame.service;

import java.util.List;

import solarx.sun.frame.model.Category;

/**
 * @ClassName: CategoryService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: 孙雷
 * @date: 2019年7月7日 上午9:02:31
 * 
 */
public interface CategoryService {
	public Category getById(Integer id);
	public Integer getCount();
	public List<Category> getList();
}
