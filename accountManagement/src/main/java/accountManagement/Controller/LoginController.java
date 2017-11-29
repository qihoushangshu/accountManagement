package accountManagement.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import accountManagement.Mapper.UserMapper;
import accountManagement.dto.User;
import accountManagement.util.StringUtil;


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
    public String getUser(HttpServletRequest request,HttpSession session) {
		logger.info("LoginController.........................getUser");
		User u = new User();
		User retUser = null;
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		if(null != account && null != password) {
			u.setAccount(account);
			//u.setPassword(password);
			retUser = userMapper.getUser(u);
			password = StringUtil.MD5Encode(password);
			if(retUser != null && password.equals(retUser.getPassword())) {
				session.setAttribute("account", account);//将用户信息存入session中
				return "index";  
			}
			
		}
		return "login";
    }  

	@RequestMapping(value="/logout") 
    public String logout(HttpSession session) {
		session.removeAttribute("account");
		return "login";
		
	}
}
