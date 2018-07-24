package com.test.converter.entity;

import java.time.LocalDate;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Ryan Miao at 2018-07-24 19:16
 **/
@Accessors(chain = true)
@Data
public class User {

    private Integer id;
    private String username;
    private LocalDate birth;
    private Date createTime;
    private boolean sex;

}
