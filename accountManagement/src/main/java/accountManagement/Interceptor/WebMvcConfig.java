/**
 * 
 */
package accountManagement.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author SIXIAODONG
 *
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new UserLoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login").excludePathPatterns("/getUser").excludePathPatterns("/addUser").excludePathPatterns("/register");
	}

//	    @Override
//	    public void addInterceptors(InterceptorRegistry registry) {
//	        registry.addInterceptor(new UserLoginInterceptor()).addPathPatterns("/**");
//	    }
}
