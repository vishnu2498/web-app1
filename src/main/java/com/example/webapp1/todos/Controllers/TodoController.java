package com.example.webapp1.todos.Controllers;

import com.example.webapp1.todos.Services.TodoList;
import com.example.webapp1.todos.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
@RequestMapping("/todo")
public class TodoController {
    private TodoList todoList;

    public TodoController(TodoList todoList) {
        super();
        this.todoList = todoList;
    }

    @GetMapping("/list-todos")
    public String listAllTodos(ModelMap model)
    {
        List<Todo> todos = todoList.findByUser("Vishnu");
        model.put("todos",todos);
        return "listTodos";
    }
}
