package accountManagement.Controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import accountManagement.Mapper.UserMapper;
import accountManagement.dto.User;


@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class); 
	@Autowired
	UserMapper userMapper;
	
	
	
	@RequestMapping(value="/login") 
    public String login() {
		logger.info("LoginController.........................login");
        return "login";  
          
    }  
	
	@RequestMapping(value="/getUser") 
    public String getUser(HttpServletRequest request) {
		logger.info("LoginController.........................getUser");
		User u = new User();
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		u.setAccount(account);
		u.setPassword(password);
		userMapper.getUser(u);
        return "index";  
          
    }  

}
