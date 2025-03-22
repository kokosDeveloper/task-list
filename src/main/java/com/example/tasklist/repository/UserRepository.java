package com.example.tasklist.repository;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;
@Mapper
public interface UserRepository {
    //на уровне репозитория - find
    //на уровне сервиса - get
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    void update(User user);
    //БД назначит id, этот id настроится юзеру
    void create(User user);
    //если больше 1 параметра надо указывать Param для ibatis
    void insertUserRole(@Param("userId") Long userId,@Param("role") Role role);
    boolean isTaskOwner(@Param("userId") Long userId,@Param("taskId") Long taskId);
    void delete(Long userId);
}
