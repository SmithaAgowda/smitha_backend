package com.excel.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeTechnicalSkill;

public interface EmployeeSkillRepository extends JpaRepository<EmployeeTechnicalSkill,Integer> {

	Optional<EmployeeTechnicalSkill> findBySkillTypeAndSkillRatingAndYearOfExp(String skilType, String skillRating, Integer yearOfExp);
}
