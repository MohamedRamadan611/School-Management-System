package com.SchoolManagementSystem.repository;

import com.SchoolManagementSystem.entity.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher , Integer> {
    Optional<Teacher> findByEmail(String email);
}
