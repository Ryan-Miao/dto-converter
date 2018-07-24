package com.test.converter;

import com.test.converter.entity.User;
import com.test.converter.mapper.UserMapper;
import com.test.converter.vo.UserVo;
import java.time.LocalDate;
import java.util.Date;
import org.junit.Test;

/**
 * @author Ryan Miao at 2018-07-24 19:22
 **/
public class UserMapperTest {

    @Test
    public void test() {
        User user = new User().setId(1).setBirth(LocalDate.now()).setCreateTime(new Date())
            .setUsername("tset").setSex(true);
        UserVo userVo = UserMapper.INSTANCE.fromUser(user);
        System.out.println(userVo);
    }

}
