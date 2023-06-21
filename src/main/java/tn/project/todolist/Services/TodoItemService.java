package tn.project.todolist.Services;

import tn.project.todolist.entities.TodoItem;

import java.util.List;

public interface TodoItemService {
  void add(TodoItem a);
  TodoItem update(TodoItem a);
  List<TodoItem> getAll();
  TodoItem getById(long id);
  void remove(long id);
}
