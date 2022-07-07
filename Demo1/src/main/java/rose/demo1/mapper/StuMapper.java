package rose.demo1.mapper;

import rose.demo1.test.Stu;

import java.util.List;

public interface StuMapper {
    List<Stu> SelectAll();


    List<Stu> SelectById(int id);


}
