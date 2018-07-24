package com.test.converter.mapper;

import com.test.converter.entity.User;
import com.test.converter.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author Ryan Miao at 2018-07-24 19:18
 **/
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({
        @Mapping(source = "sex", target = "man"),
        @Mapping(source = "username", target = "name")
    })
    UserVo fromUser(User user);

}
