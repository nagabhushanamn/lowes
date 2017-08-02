package com.example.demo.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.demo.service.TodoService;

public class TodoBusinessImplTest2 {

	@Test
	public void usingMock() {
		// Arrange
		List<String> todos = Arrays.asList("Learn Spring", "Learn Spring Boot", "Learn JS");
		TodoService todoService = mock(TodoService.class);
		when(todoService.getTodos(anyString())).thenReturn(todos);

		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService); // SUT
		// Act
		List<String> actualTodos = todoBusiness.getTodosRelatedToSpring("Ria");
		// Assert
		assertEquals(2, actualTodos.size());
	}

}
