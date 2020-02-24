package com.casic.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;//主键
    private String dname;//部门名称
    private String db_source;//来自哪个数据库，因为数据库微服务构架可以以一个服务对应一个数据库
                                  // ，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }

}
