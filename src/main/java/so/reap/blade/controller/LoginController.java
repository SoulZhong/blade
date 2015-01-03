/**
 * 
 */
package so.reap.blade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author soul
 *
 */

@Controller
@RequestMapping("/")
public class LoginController {
	
	@RequestMapping("login")
	public String login(){
		
		
		return "login";
	}

}
