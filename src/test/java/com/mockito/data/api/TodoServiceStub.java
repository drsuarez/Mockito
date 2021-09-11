package com.mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

	public List<String> retriveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}

}
