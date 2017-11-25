/**
 * 
 */
package accountManagement.Controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import accountManagement.Mapper.UserMapper;
import accountManagement.dto.User;

/**
 * @author SIXIAODONG
 *
 */
@Controller
public class RegisterController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	UserMapper userMapper;
	
	
	@RequestMapping(value="/register") 
    public String register() {  
		logger.info("RegisterController ........................register");
        return "register";
          
    }  
	
	@RequestMapping(value="/addUser") 
    public String addUser(HttpServletRequest request) {  
		logger.info("RegisterController ........................addUser");
		User u = new User();
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		u.setAccount(account);
		u.setPassword(password);
		u.setEmail(email);
		userMapper.saveUser(u);
        return "login";
          
    }  
}
