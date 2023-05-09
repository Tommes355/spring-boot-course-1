package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;



@Controller
@SessionAttributes("name")
public class TodoController {

  

  public TodoController(TodoService todoService) {
    super();
    this.todoService = todoService;
  }

  private TodoService todoService;

  @RequestMapping("list-todos")
  public String listAllTodos(ModelMap model) {
    List<Todo> todos = todoService.findByUsername("in28minutes");
    model.addAttribute("todos", todos);

    return "listTodos";
  }
  
}
