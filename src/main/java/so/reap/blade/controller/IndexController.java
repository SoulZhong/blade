/**
 * 
 */
package so.reap.blade.controller;

import javax.persistence.Index;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author soul
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

	private Logger logger = Logger.getLogger(Index.class);
	@RequestMapping("index")
	public String index(){
		
		logger.debug("=================== index ===================");
		
		return "index";
		
	}
}
