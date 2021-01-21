package com.struct;

import java.sql.Date;

/**
 * table name: case_group
 * author name: abel
 * create time: 2021-01-21 14:54:01
 */
public class CaseGroupVO {

    private String id;
    private String description;
    private Date createTime;
    private Date updateTime;

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }

    public void setCreateTime(Date createTime){
        this.createTime=createTime;
    }

    public Date getCreateTime(){
        return createTime;
    }

    public void setUpdateTime(Date updateTime){
        this.updateTime=updateTime;
    }

    public Date getUpdateTime(){
        return updateTime;
    }

    @Override
    public String toString() {
        return "CaseGroupVO{" +
            "id='" + id + '\'' +
            ", description='" + description + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            "}";
    }
}

