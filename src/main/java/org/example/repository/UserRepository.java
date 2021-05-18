package org.example.repository;

import org.example.entity.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();

    List<User> findAllLazy();

    User findById(Long id);

    User findAllElementByDepartmentId(Long departmentId);

    int insert(User department);

    int update(User department);

    int delete(Long id);
}
