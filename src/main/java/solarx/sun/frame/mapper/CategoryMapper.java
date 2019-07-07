/**
 * @Title: CategoryMapper.java
 * @Package solarx.sun.frame.mapper
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 孙雷
 * @date: 2019年7月7日 下午3:00:22
 * @version V1.0
 */
package solarx.sun.frame.mapper;

import java.util.List;

import solarx.sun.frame.model.Category;

/**
 * @ClassName: CategoryMapper
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: 孙雷
 * @date: 2019年7月7日 下午3:00:22
 * 
 */
public interface CategoryMapper {
	public Category getById(Integer id);
	public Integer getCount();
	public List<Category> getList();
}
