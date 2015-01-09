package com.vanceinfo.javaserial.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.vanceinfo.javaserial.model.User;
import com.vanceinfo.javaserial.services.UserServiceImpl;

@Controller
@RequestMapping("user")
public class UserController {
	@Value("${jdbc_password}")
	private String sss;
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String create1() {
		return "user/create";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create1(User user) {
		userService.insertById(user);
		return "redirect:/user/list";
	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update2() {
		return "user/update";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update2(User user) {
		userService.update(user);
		return "redirect:/user/listx";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delet3e() {
		return "user/delete";
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String delete3(int id) {
		userService.delete(id);
		return "redirect:/user/list";
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(HttpServletRequest request) {
		List<User> users = userService.getAllUser();
		request.setAttribute("userList", users);
		return "user/list1";
	}
}