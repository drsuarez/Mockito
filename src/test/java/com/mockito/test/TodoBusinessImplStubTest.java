package com.mockito.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.mockito.business.TodoBusinessImpl;
import com.mockito.data.api.TodoService;
import com.mockito.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos = todoBusinessImpl.retriveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}
