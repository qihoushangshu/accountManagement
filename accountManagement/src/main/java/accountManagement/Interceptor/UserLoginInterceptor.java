/**
 * 
 */
package accountManagement.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import accountManagement.dto.User;

/**
 * @author SIXIAODONG
 *
 */
public class UserLoginInterceptor  implements HandlerInterceptor {
	
	private static final Logger logger = LoggerFactory.getLogger(UserLoginInterceptor.class); 
	 //参考地址：http://m.blog.csdn.net/JJ1273365548/article/details/65630433
	 /**
     * 不做拦截的url
     */
    private static final String[] PASS_URL = {"/getUser","/login","/addUser","/register"};

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		    boolean flag = false;
	        String servletPath = request.getServletPath();
	        logger.info("请求路径是: "+servletPath);
	        for (String s : PASS_URL) {
	            if (servletPath.contains(s)) {
	            	logger.info("该请求不需要拦截");
	                flag = true;
	            }

	        }
	    
	        if (!flag) {
	            // 获取存储在session域的用户
	            User user = (User) request.getSession().getAttribute("user");
	            if (user == null) {
	            	logger.info("用户未登录，禁止直接访问，返回登录页面");
	                request.setAttribute("message", "请先登录");
	                // 服务器内部转发，可以带回request
	                request.getRequestDispatcher("/login").forward(request, response);
	            }

	            else {
	            	logger.info("用户已经登录，可以成功浏览网页");
	                flag = true;
	            }

	        }

	        return flag;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.info("拦截请求之后");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("控制器处理完成之后");
		
	}

}
