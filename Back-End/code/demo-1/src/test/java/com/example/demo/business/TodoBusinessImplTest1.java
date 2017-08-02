package com.example.demo.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.example.demo.service.TodoService;

public class TodoBusinessImplTest1 {

	@Test
	public void usingStub() {
		// Arrange
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);
		// Act
		List<String> todos = todoBusiness.getTodosRelatedToSpring("Nag");
		// Assert
		assertEquals(2, todos.size());
	}
	
	

}
