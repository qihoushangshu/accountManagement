/**
 * 
 */
package accountManagement.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import accountManagement.Mapper.AccountMapper;
import accountManagement.Mapper.UserMapper;
import accountManagement.dto.Account;
import accountManagement.dto.User;

/**
 * @author SIXIAODONG
 *
 */
@Controller
public class ManagementController {

	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class); 
	@Autowired
	AccountMapper accountMapper;
	
	
	
	@RequestMapping(value="/saveData") 
    public String saveData(HttpServletRequest request,HttpSession session) {
		logger.info("ManagementController.........................saveData");
		String clothes = request.getParameter("clothes");
		logger.info("clothes    :"+clothes);
		String eat = request.getParameter("eat");
		String traffic = request.getParameter("traffic");
		String propertyCosts = request.getParameter("propertyCosts");
		String waterSoOn = request.getParameter("waterSoOn");
		String outEat = request.getParameter("outEat");
		String drug = request.getParameter("drug");
		String book = request.getParameter("book");
		String sick = request.getParameter("sick");
		String other = request.getParameter("other");
		Account accountDto = new Account();
		accountDto.setClothes(clothes);
		accountDto.setEat(eat);
		accountDto.setTraffic(traffic);
		accountDto.setPropertyCosts(propertyCosts);
		accountDto.setWaterSoOn(waterSoOn);
		accountDto.setOutEat(outEat);
		accountDto.setDrug(drug);
		accountDto.setBook(book);
		accountDto.setSick(sick);
		accountDto.setOther(other);
		accountDto.setDeleteflag("0");
		User user = (User) session.getAttribute("user");
		accountDto.setUserid(user.getId());
		accountMapper.saveAccount(accountDto);
		logger.info("savedata ok    :");
        return "index";  
          
    }  
}
