package com.jh.domain;

import java.io.Serializable;

public class Task extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [id=" + getId() + ", name=" + name + ", status=" + status + "]";
	}

}
