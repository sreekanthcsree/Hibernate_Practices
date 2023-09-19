package com.first.repo;

import com.first.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {

    Optional<Student> findByName(String studentName) throws Exception;

}
