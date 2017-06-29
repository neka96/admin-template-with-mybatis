package org.kshrd.template.controller;

import org.kshrd.template.model.User;
import org.kshrd.template.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class MainController {

	private UserService userService;

	@Autowired
	public MainController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/user-list")
	public String userList(ModelMap map) {
		map.put("USER", userService.getAllUser());
		return "user-list";
	}

	@RequestMapping("/delete-user/{userHash}")
	public String deleteUser(@PathVariable("userHash") String userHash) {
		userService.deleteUser(userHash);
		return "redirect:/user-list";
	}

	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user) {
		userService.insertUser(user);
		return "redirect:/user-list";
	}

	@RequestMapping("/update-user")
	public String updateUser(@ModelAttribute User user, ModelMap map) {
		userService.updateUser(user);

		return "redirect:/user-list";
	}

	@RequestMapping("/add-form")
	public String insertionForm(@PathVariable("userHash") String userHash, ModelMap map) {
		map.put("USER", new User());
		map.put("ACTION", "/add-user");
		return "register";
	}

	@RequestMapping("/update-form/{userHash}")
	public String insertionForm(@PathVariable("userHash") String userHash, ModelMap map) {
		map.put("USER", userService.findUserByHashCode(userHash));
		map.put("ACTION", "/update-user");
		return "register";
	}

}
