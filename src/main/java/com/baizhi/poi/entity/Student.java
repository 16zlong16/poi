package com.baizhi.poi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student {
    @Excel(name = "学生姓名")
    private String name;
    @Excel(name = "学生年龄")
    private Integer age;
    @Excel(name = "学生性别", replace = {"男_1", "女_2"})
    private String sex;
}
