package com.mockito.business;

import java.util.ArrayList;
import java.util.List;

import com.mockito.data.api.TodoService;

public class TodoBusinessImpl {
	public TodoService todoService;
	
	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retriveTodosRelatedToSpring(String user) {
		List<String> filteredTodos =  new ArrayList<String>();
		List<String> todos =  todoService.retriveTodos(user);
		
		for (String todo:todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}

}
