package accountManagement.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import accountManagement.dto.User;
import accountManagement.dto.Uuser;

@Mapper
public interface UserMapper {
@Select("select * from user where name = #{name}")
Uuser findUserByName(@Param("name")String name);

@Insert("insert into tb_user(id,account,password,email) values(TB_USER_SEQUENCE.nextval,#{account},#{password},#{email})")  
//@Options(useGeneratedKeys=true,keyProperty="id")  
int saveUser(User user);
}