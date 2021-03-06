package com.jh.dao;

import com.jh.domain.Blog;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDaoImpl implements BlogDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public Blog getBlog(Long id) {
        return sqlSessionTemplate.selectOne("com.jh.dao.BlogDao.selectBlog", id);
    }

    @Override
    public int update(Blog blog) {
        return sqlSessionTemplate.update("com.jh.dao.BlogDao.update", blog);
    }

}
