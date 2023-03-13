package com.example.webapp1.todos.Services;

import com.example.webapp1.todos.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class TodoList {
    private static List<Todo> todos;

    static{
        todos = new ArrayList<>();
        todos.add(new Todo(1, "Vishnu", "Spring Boot", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(2, "Vishnu","Learn AWS", LocalDate.now().plusYears(1), false ));
        todos.add(new Todo(3, "Vishnu","Learn DevOps", LocalDate.now().plusYears(2), false ));
        todos.add(new Todo(4, "Vishnu","Learn Full Stack Development", LocalDate.now().plusYears(3), false ));
    }

    public List<Todo> findByUser(String user)
    {
        return todos;
    }
}
