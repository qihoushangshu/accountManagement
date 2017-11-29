package accountManagement.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import accountManagement.dto.User;

@Mapper
public interface UserMapper {

@Insert("insert into tb_user(id,account,password,email,flag,cretime) values	(TB_USER_SEQUENCE.nextval,#{account},#{password},#{email},'0',to_char(sysdate,'YYYY/MM/DD'))")  
//@Options(useGeneratedKeys=true,keyProperty="id")  
int saveUser(User user);

/**
 * @param u
 */
@Select("select * from tb_user where account=#{account}")
User getUser(User u);
}