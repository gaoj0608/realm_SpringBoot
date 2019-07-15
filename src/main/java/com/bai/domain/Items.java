package com.bai.domain;


import lombok.Data;

import java.util.Date;
@Data
public class Items {
    private Integer id;
    private  String name;
    private  Float price;
    private String detail;

    private Date createtime;

}
