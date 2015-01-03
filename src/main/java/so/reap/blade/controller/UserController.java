/**
 * 
 */
package so.reap.blade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import so.reap.blade.dao.user.UserDao;

/**
 * @author soul
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserDao userDao;

	@RequestMapping("/list")
	public String listUsers(Model model) {

		model.addAttribute("users", userDao.findAll());

		return "user/list";
	}
}
