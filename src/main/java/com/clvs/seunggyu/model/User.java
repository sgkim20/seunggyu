package com.clvs.seunggyu.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class User {
    private long seq;
    private String name;
    private Date birthday;
    private String address;
    private String phone;
    private LocalDateTime createDate;
}
