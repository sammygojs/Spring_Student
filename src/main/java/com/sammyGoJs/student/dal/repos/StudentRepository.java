package com.sammyGoJs.student.dal.repos;

import org.springframework.data.repository.CrudRepository;
import com.sammyGoJs.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
