package com.jh.service;

import com.jh.domain.Blog;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BlogServiceTest extends SpringBaseTest {

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
        aBlog.setTitle("aaa3333666999999999");
        Blog blog = blogService.update(aBlog);
        System.out.println(blog);
        System.out.println(blogService);
    }
}
