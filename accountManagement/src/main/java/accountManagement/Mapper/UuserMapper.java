package accountManagement.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import accountManagement.dto.Uuser;

@Mapper
public interface UuserMapper {
@Select("select * from uuser where name = #{name}")
Uuser findUserByName(@Param("name")String name);
}