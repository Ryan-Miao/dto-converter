package com.test.converter.vo;

import java.time.LocalDate;
import java.util.Date;
import lombok.Data;

/**
 * @author Ryan Miao at 2018-07-24 19:17
 **/
@Data
public class UserVo {

    private Integer id;
    private String name;
    private LocalDate birth;
    private Date createTime;
    private boolean man;

}
