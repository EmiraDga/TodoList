package tn.project.todolist.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.project.todolist.entities.TodoItem;
import tn.project.todolist.repository.TodoItemRepo;

import java.util.List;
@Service
public class TodoItemServiceImpl implements TodoItemService {

  @Autowired
  TodoItemRepo todoItemRepo;

  @Override
  public void add(TodoItem a) {
    todoItemRepo.save(a);
  }

  @Override
  public TodoItem update(TodoItem a) {
    return todoItemRepo.save(a);
  }

  @Override
  public List<TodoItem> getAll() {
    return (List<TodoItem>) todoItemRepo.findAll();
  }

  @Override
  public TodoItem getById(long id) {
    return  todoItemRepo.findById(id).orElse(null);
  }

  @Override
  public void remove(long id) {
    todoItemRepo.deleteById(id);
  }
}
