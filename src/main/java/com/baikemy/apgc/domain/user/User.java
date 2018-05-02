package com.baikemy.apgc.domain.user;

import java.util.Date;
import java.util.List;
//222222
public class User {
    private Long id;

    private String email;

    private String pswd;

    private Boolean status;
    
    private Boolean ismodifypswd;

    private Date createTime;

    private Date modifyTime;
    
    private Integer limit;
    
    private Integer offset;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd == null ? null : pswd.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

	public Boolean getIsmodifypswd() {
		return ismodifypswd;
	}

	public void setIsmodifypswd(Boolean ismodifypswd) {
		this.ismodifypswd = ismodifypswd;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	
}
