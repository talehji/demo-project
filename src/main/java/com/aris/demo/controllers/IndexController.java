package com.aris.demo.controllers;

import com.aris.demo.entities.Todo;
import com.aris.demo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

/**
 * @author : Pallas
 * @project : demo
 * @created on : 16-April-2023
 * @email : talehji@gmail.com
 */

@Controller
public class IndexController {

    private final TodoRepository todoRepository;

    public IndexController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("todoObject", new Todo());
        model.addAttribute("dataList", todoRepository.findAll());
        return "index";
    }

    @PostMapping("/todo-save")
    public String insert(@ModelAttribute Todo todo, Model model){
        System.out.println(todo.toString());
        todoRepository.save(todo.setCreatedAt(LocalDateTime.now()));
        model.addAttribute("todoObject", new Todo());
        model.addAttribute("dataList", todoRepository.findAll());
        return "index";
    }
}
