package com.example.daomapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.models.Student;

@Repository
public interface StrudentMapper {
	@Select("SELECT * FROM student WHERE id = #{id}")
	public Student getStudentByID(int id);
}
