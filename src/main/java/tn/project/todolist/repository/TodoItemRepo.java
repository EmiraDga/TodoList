package tn.project.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.project.todolist.entities.TodoItem;

public interface TodoItemRepo  extends JpaRepository<TodoItem,Long> {
}
