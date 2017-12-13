/**
 * 
 */
package accountManagement.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/saveData", method = {RequestMethod.POST }) 
	@ResponseBody
    public void  saveData(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws IOException {
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
		JSONObject returnObj = new JSONObject();
		returnObj.put("status", "1");
		response.getWriter().print(returnObj.toString());
		response.getWriter().flush();
        //return "success";  
          
    }  
}
