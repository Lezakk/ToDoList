package com.todolist.todolist.repo;

import com.todolist.todolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository <TodoItem, Long>{
}
