/**
 * @Title: CategoryController.java
 * @Package solarx.sun.frame.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 孙雷
 * @date: 2019年7月7日 上午9:15:07
 * @version V1.0
 */
package solarx.sun.frame.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import solarx.sun.frame.model.Category;
import solarx.sun.frame.service.CategoryService;

/**
 * @ClassName: CategoryController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: 孙雷
 * @date: 2019年7月7日 上午9:15:07
 * 
 */
@Controller
@RequestMapping(value="/category")
public class CategoryController {
	
//	private static Logger logger = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/list/{categoryId}", method=RequestMethod.GET)
	public String doShowList(Map<String, Object> model, @PathVariable("categoryId") Integer id) {
//		logger.info("请求参数：" + id);
		Category category = categoryService.getById(id);
		model.put("category", category);
		return "category/test";
	}
	
}
