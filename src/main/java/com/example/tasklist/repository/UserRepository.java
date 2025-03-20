package com.example.tasklist.repository;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;

import java.util.Optional;

public interface UserRepository {
    //на уровне репозитория - find
    //на уровне сервиса - get
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    void update(User user);
    //БД назначит id, этот id настроится бзеру
    void create(User user);
    void insertUserRole(Long userId, Role role);
    boolean isTaskOwner(Long userId, Long taskId);
    void delete(Long userId);
}
