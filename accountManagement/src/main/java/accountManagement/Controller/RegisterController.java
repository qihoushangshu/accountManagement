/**
 * 
 */
package accountManagement.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SIXIAODONG
 *
 */
@Controller
public class RegisterController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping(value="/register") 
    public String register() {  
		logger.info("RegisterController ........................start");
        return "register";  
          
    }  
}
