package com.meta.spring_data_jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.meta.spring_data_jpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    public Student findByName(String name);

    public Student findByMarksGreaterThan(int marks);

    // @Query("select s from student s where s.name = ?1")
    // public Student findAnkit(String name);
}
