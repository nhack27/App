package com.example.app.controllers;

import com.example.app.model.TodoModel;
import com.example.app.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;



@RestController
@RequestMapping(value = "/todo")
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    @GetMapping(path = "getdata")
    List<TodoModel> getTodo(){
    return todoRepository.findAll();



    }
    @PostMapping(path = "postdata")
    public TodoModel save(@RequestBody TodoModel todoModel){
        return todoRepository.save(todoModel);
    }
    @PutMapping(path="putdata")
    public TodoModel update(@RequestBody TodoModel todoModel){
        return todoRepository.save(todoModel);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        todoRepository.deleteAllById(id);
    }



}
