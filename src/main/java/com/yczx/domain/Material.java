package com.yczx.domain;

import java.io.Serializable;
import java.sql.Date;

public class Material implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id, type, valid, fileId;
	private String name, description;
	private Date createTime;

	public void clear() {
		id = null;
		type = null;
		valid = null;
		name = null;
		description = null;
		fileId = null;
		createTime = null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getValid() {
		return valid;
	}

	public void setValid(Long valid) {
		this.valid = valid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

}
