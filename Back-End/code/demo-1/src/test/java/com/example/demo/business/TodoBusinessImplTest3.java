package com.example.demo.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.example.demo.service.TodoService;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplTest3 {

	@Mock
	TodoService todoService;

	@InjectMocks
	TodoBusinessImpl todoBusiness;

	@Test
	public void usingMock() {
		List<String> todos = Arrays.asList("Learn Spring", "Learn Spring Boot", "Learn JS");
		when(todoService.getTodos(anyString())).thenReturn(todos);
		List<String> actualTodos = todoBusiness.getTodosRelatedToSpring("Ria");
		assertEquals(2, actualTodos.size());
	}

}
