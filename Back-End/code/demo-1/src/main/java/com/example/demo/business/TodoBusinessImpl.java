package com.example.demo.business;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.service.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> getTodosRelatedToSpring(String user) {
		List<String> todos = todoService.getTodos(user);
		List<String> filteredTodos = new ArrayList<>();
		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
