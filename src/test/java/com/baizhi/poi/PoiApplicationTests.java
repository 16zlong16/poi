package com.baizhi.poi;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.baizhi.poi.entity.Student;
import com.baizhi.poi.entity.Teacher;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = PoiApplication.class)
@RunWith(SpringRunner.class)
public class PoiApplicationTests {

    @Test
    public void contextLoads() {
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        Student abc = new Student("abc", 18, "1");
        Student abc1 = new Student("ccc", 18, "1");
        Student abc2 = new Student("ddd", 18, "2");
        students.add(abc);
        students.add(abc1);
        students.add(abc2);
        Teacher teacher = new Teacher("1", "张三", new Date(), students);
        Teacher teacher1 = new Teacher("2", "李四", new Date(), students);
        Teacher teacher2 = new Teacher("3", "王五", new Date(), students);
        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher2);
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("老师表", "老师"), Teacher.class, teachers);
        try {
            workbook.write(new FileOutputStream(new File("E:/out.xls")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
