package com.example.todolist.repository;

import com.example.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xcw
 * @create 2024/11/10
 * @description
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}