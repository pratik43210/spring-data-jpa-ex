package com.pratik.spring_data_jpa_ex.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pratik.spring_data_jpa_ex.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
//	Query is optional for these two because certain queries are
//	defined by default by the DSL(Domain Specific Language)
//	@Query("select s from Student s where s.name= ?1")
	List<Student> findByName(String name);
	
//	@Query("select s from Student s where s.marks> ?1")
	List<Student> findByMarksGreaterThan(int marks);
}
