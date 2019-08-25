package cn.yan.service;

import cn.yan.entity.Student;

import java.util.Collection;

public interface StudentService {
    public Collection<Student> findAll();

    public Student findById(Long id);

    public void aveOrUpdate(Student student);

    public void deleteById(Long id);
}
