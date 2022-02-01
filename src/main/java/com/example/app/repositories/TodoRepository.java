package com.example.app.repositories;

import com.example.app.model.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<TodoModel, Integer> {
    @Override
    List<TodoModel> findAll();


    void deleteAllById(Long id);
}