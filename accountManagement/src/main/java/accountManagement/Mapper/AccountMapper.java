package accountManagement.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import accountManagement.dto.Account;
import accountManagement.dto.User;

@Mapper
public interface AccountMapper {

	@Insert("insert into tb_account(id,userid,clothes,eat,traffic,propertyCosts,watersoon,outeat,drug,book,sick,other,deleteflag,cretime) values (TB_ACCOUNT_SEQUENCE.nextval,#{userid},#{clothes},#{eat},#{traffic},#{propertyCosts},#{waterSoOn},#{outEat},#{drug},#{book},#{sick},#{other},#{deleteflag},to_char(sysdate,'YYYY/MM/DD'))")  
int saveAccount(Account account);

/**
 * @param u
 */
@Select("select * from tb_user where account=#{account}")
User getUser(User u);
}