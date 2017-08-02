package com.example.demo.business;

import java.util.Arrays;
import java.util.List;

import com.example.demo.service.TodoService;

public class TodoServiceStub implements TodoService {

	@Override
	public List<String> getTodos(String user) {
		return Arrays.asList("Learn Spring", "Learn Spring Boot", "Learn JS");
	}

}
