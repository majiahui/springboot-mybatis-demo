package com.jh.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jh.Application;
import com.jh.domain.Task;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TaskServiceTest {

	@Autowired
	private TaskService taskService;

	@Test
	public void test1() {
		Task so = new Task();
		so.setPage(1);
		so.setRows(5);
		so.setStatus("1");
		List<Task> tasks = taskService.get(so);
		for (Task task : tasks) {
			System.out.println(task);
		}
	}
	
	@Test
	public void testPage() {
		int count = taskService.testMybatisPage();
		System.out.println(count);
	}
}
