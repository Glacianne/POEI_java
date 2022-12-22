package com.example.tp1.controller;

import com.example.tp1.entity.Todolist;
import com.example.tp1.service.TodolistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/todo")
@ResponseBody
public class TodolistController {

    @Autowired
    TodolistService todolistService;

    @PostMapping("")
    public Todolist postTodolist(@RequestBody Todolist todolist){
        if(todolistService.create(todolist)) {
            return todolist;
        }
        return null;
    }

    @PostMapping("/update/{id}")
    public Todolist updateTodolist(@PathVariable int id, @RequestBody Todolist newTodolist){
        Todolist todolist = todolistService.findById(id);
        if(todolist != null){
            todolist.setTitle(newTodolist.getTitle());
            todolist.setDescription(newTodolist.getDescription());
            todolist.setDate(newTodolist.getDate());
            todolist.setDone(newTodolist.isDone());
        }
        if(todolistService.update(todolist)) {
            return todolist;
        }
        return null;
    }

    @PostMapping("/delete/{id}")
    public String deleteTodolist(@PathVariable int id){
        Todolist todolist = todolistService.findById(id);
        if (todolist != null && todolistService.delete(todolist)){
            return "liste supprimée";
        }
        return "une erreur s'est produite";
    }

    @GetMapping("/{id}")
    public Todolist findById(@PathVariable int id){
        return todolistService.findById(id);
    }

    @GetMapping("/findAll/{isDone}")
    public List<Todolist> findAll(@PathVariable boolean isDone){
        return todolistService.findAll(isDone);
    }


    /*@GetMapping("/findAllDone")
    public List<Todolist> findAllDone(){
        return todolistService.findAllDone();
    }

    @GetMapping("/findAllTodo")
    public List<Todolist> findAllTodo(){
        return todolistService.findAllTodo();
    }*/

}
