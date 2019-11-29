package com.baizhi.poi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)

@ExcelTarget(value = "教师")
public class Teacher {
    @Excel(name = "ID", needMerge = true)
    private String id;
    @Excel(name = "名字", needMerge = true)
    private String name;
    @Excel(name = "生日", format = "yyyy-MM-dd", width = 15, needMerge = true)
    private Date bir;
    @ExcelCollection(name = "学生们")
    private List<Student> students;

}
