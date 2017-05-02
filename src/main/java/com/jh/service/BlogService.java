package com.jh.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jh.dao.BlogDao;
import com.jh.domain.Blog;

@Service
public class BlogService {

	private final static Logger logger = LoggerFactory.getLogger(BlogService.class);
	
	@Autowired
	private BlogDao blogDao;

	@Transactional
	public Blog getBlog(Long id) {
		Blog b1 = blogDao.getBlog(id);
		logger.debug(b1.toString());
		Blog b2 = blogDao.getBlog(id);
		logger.debug(b2.toString());
		return b2;
	}

	@Transactional
	public Blog update(Blog blog) {
		blogDao.update(blog);
		return blogDao.getBlog(blog.getId());
	}
}
