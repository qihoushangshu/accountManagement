package accountManagement.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import accountManagement.dto.User;

@Mapper
public interface UserMapper {

@Insert("insert into tb_user(id,account,password,email) values(TB_USER_SEQUENCE.nextval,#{account},#{password},#{email})")  
//@Options(useGeneratedKeys=true,keyProperty="id")  
int saveUser(User user);

/**
 * @param u
 */
@Select("select * from tb_user where account=#{account} and password=#{password}")
User getUser(User u);
}