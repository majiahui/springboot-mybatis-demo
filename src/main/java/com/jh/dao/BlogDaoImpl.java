package com.jh.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jh.domain.Blog;

@Repository
public class BlogDaoImpl implements BlogDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public Blog getBlog(Long id) {
		return sqlSessionTemplate.selectOne("com.jh.dao.BlogDao.selectBlog", id);
	}

}
