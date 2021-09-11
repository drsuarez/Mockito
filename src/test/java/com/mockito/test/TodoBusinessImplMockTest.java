package com.mockito.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mockito.business.TodoBusinessImpl;
import com.mockito.data.api.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void usingMockito() {
		
		TodoService todoService = mock(TodoService.class);
		List<String> allTodos = Arrays.asList();
		
		when(todoService.retriveTodos("Dummy")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retriveTodosRelatedToSpring("Dummy");
		assertEquals(0, todos.size());
	}

}
