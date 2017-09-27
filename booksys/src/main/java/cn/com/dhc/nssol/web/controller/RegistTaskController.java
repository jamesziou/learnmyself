package cn.com.dhc.nssol.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.dhc.nssol.common.constants.UrlConstants;
import cn.com.dhc.nssol.common.constants.ViewNameConstants;

/**
 * 任务管理 控制器
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping(UrlConstants.TASK_URL)
public class RegistTaskController {

	@RequestMapping(value = UrlConstants.ADD_TASK_URL, method = RequestMethod.GET)
	public String addTask() {
		return ViewNameConstants.VIEW_NAME_ADD_TASK_PAGE;
	}
}
