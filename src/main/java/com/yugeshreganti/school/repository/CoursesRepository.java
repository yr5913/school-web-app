package com.yugeshreganti.school.repository;

import com.yugeshreganti.school.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer> {
}
