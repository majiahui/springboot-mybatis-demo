package com.jh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jh.dao.BlogDao;
import com.jh.domain.Blog;

@Service
public class BlogService {

	@Autowired
	private BlogDao blogDao;
	
	@Transactional
	public Blog getBlog(Long id) {
		Blog b1 = blogDao.getBlog(id);
		System.out.println(b1);
		Blog b2 = blogDao.getBlog(id);
		System.out.println(b2);
		return b2;
	}
}
