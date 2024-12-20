package com.codezx.department_service.Model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
