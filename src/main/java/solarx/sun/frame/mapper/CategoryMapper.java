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
 * @Description: Mapper接口的工作原理是JDK动态代理，Mybatis运行时会使用JDK动态代理为Mapper接口生成代理对象proxy，代理对象会拦截接口方法，转而执行MapperStatement所代表的sql，然后将sql执行结果返回。
 * @author: 孙雷
 * @date: 2019年7月7日 下午3:00:22
 * 
 */
public interface CategoryMapper {
	public Category getById(Integer id);
	public Integer getCount();
	public List<Category> getList();
}
