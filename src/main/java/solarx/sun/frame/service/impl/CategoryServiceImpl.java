/**
 * @Title: CategoryServiceImpl.java
 * @Package solarx.sun.frame.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 孙雷
 * @date: 2019年7月7日 上午9:04:46
 * @version V1.0
 */
package solarx.sun.frame.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solarx.sun.frame.model.Category;
import solarx.sun.frame.service.CategoryService;

/**
 * @ClassName: CategoryServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: 孙雷
 * @date: 2019年7月7日 上午9:04:46
 * 
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private static final String NAMESPACE = "solarx.sun.frame.mapper.CategoryMapper";
	
	@Override
	public Category getById(Integer id) {
		List<Category> lstCategory = sqlSessionTemplate.selectList(NAMESPACE + ".getById", id);
		return lstCategory.get(0);
	}

	@Override
	public Integer getCount() {
		return null;
	}

	@Override
	public List<Category> getList() {
		List<Category> lstCategory = sqlSessionTemplate.selectList(NAMESPACE + ".getList");
		return lstCategory;
	}

}
