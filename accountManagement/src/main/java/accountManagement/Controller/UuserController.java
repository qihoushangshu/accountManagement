package accountManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import accountManagement.Mapper.UuserMapper;
import accountManagement.dto.Uuser;

@RestController
@RequestMapping({"/home"})
public class UuserController {
@Autowired
UuserMapper userMapper;
@RequestMapping(value = "/user")
@ResponseBody
public String user(){
Uuser user = userMapper.findUserByName("张三");
System.out.println(user.getName()+"-----"+user.getAge());
return user.getName()+"-----"+user.getAge();
}
}