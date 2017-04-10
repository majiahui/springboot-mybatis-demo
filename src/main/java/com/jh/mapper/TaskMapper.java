package com.jh.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jh.domain.Task;
import com.jh.util.MyMapper;

@Mapper
public interface TaskMapper extends MyMapper<Task> {

}
