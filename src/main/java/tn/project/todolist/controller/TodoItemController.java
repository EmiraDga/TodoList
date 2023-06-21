package tn.project.todolist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.project.todolist.Services.TodoItemService;
import tn.project.todolist.entities.TodoItem;

import java.util.List;

@RestController
@RequestMapping("/todoItem")
@RequiredArgsConstructor
public class TodoItemController {

@Autowired
  TodoItemService todoItemService;

  @PostMapping()
  public TodoItem addTodoItem(@RequestBody TodoItem todoItem)
  {
    todoItemService.add(todoItem);
    return todoItem;
  }

  @GetMapping()
  public List<TodoItem> getAllAbonnement(){
    return todoItemService.getAll();
  }

  @PutMapping()
  public TodoItem updateTodoItem(@RequestBody TodoItem todoItem){
    todoItemService.update(todoItem);
    return todoItem;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteTodoItem(@PathVariable int id) {
    todoItemService.remove(id);
  }


}
