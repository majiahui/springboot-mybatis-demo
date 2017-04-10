package com.jh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jh.domain.Task;
import com.jh.mapper.TaskMapper;

@Service
public class TaskService {

	@Autowired
	private TaskMapper taskMapper;
	
	public List<Task> get(Task task) {
        if (task.getPage() != null && task.getRows() != null) {
            PageHelper.startPage(task.getPage(), task.getRows());
        }
        return taskMapper.select(task);
    }
	
	public int testMybatisPage() {
		Task so = new Task();
        so.setStatus("1");
        so.setPage(1);
        so.setRows(5);
        List<Task> tasks = new ArrayList<>();
        int syncCount = 0;
        do {
            PageHelper.startPage(so.getPage(), so.getRows());
        	tasks = taskMapper.select(so);
            syncCount += tasks.size();
            for (Task task : tasks) {
				System.out.println("task: " + task.getName());
				task.setStatus("2");
				taskMapper.updateByPrimaryKey(task);
			}
        } while (tasks.size() == 5);
        return syncCount;
	}
}
