package com.jh.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jh.Application;
import com.jh.domain.Blog;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class BlogServiceTest {

	@Autowired
	private BlogService blogService;
	
	@Test
	public void test_get() {
		blogService.getBlog(1L);
	}
	
	@Test
	public void test_update() {
		Blog aBlog = new Blog();
		aBlog.setId(1L);
		aBlog.setTitle("aaa333");
		Blog blog = blogService.update(aBlog);
		System.out.println(blog);
	}
}
