package com.struct;

import java.sql.Date;

/**
 * table name: case_detail
 * author name: abel
 * create time: 2021-01-21 14:54:01
 */
public class CaseDetailVO {

    private Integer id;
    private String url;
    private String path;
    private String header;
    private String method;
    private String data;
    private String assertions;
    private String extract;
    private String description;
    private Date createTime;
    private Date updateTime;
    private String groupId;

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getId(){
        return id;
    }

    public void setUrl(String url){
        this.url=url;
    }

    public String getUrl(){
        return url;
    }

    public void setPath(String path){
        this.path=path;
    }

    public String getPath(){
        return path;
    }

    public void setHeader(String header){
        this.header=header;
    }

    public String getHeader(){
        return header;
    }

    public void setMethod(String method){
        this.method=method;
    }

    public String getMethod(){
        return method;
    }

    public void setData(String data){
        this.data=data;
    }

    public String getData(){
        return data;
    }

    public void setAssertions(String assertions){
        this.assertions=assertions;
    }

    public String getAssertions(){
        return assertions;
    }

    public void setExtract(String extract){
        this.extract=extract;
    }

    public String getExtract(){
        return extract;
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

    public void setGroupId(String groupId){
        this.groupId=groupId;
    }

    public String getGroupId(){
        return groupId;
    }

    @Override
    public String toString() {
        return "CaseDetailVO{" +
            "id=" + id +
            ", url='" + url + '\'' +
            ", path='" + path + '\'' +
            ", header='" + header + '\'' +
            ", method='" + method + '\'' +
            ", data='" + data + '\'' +
            ", assertions='" + assertions + '\'' +
            ", extract='" + extract + '\'' +
            ", description='" + description + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", groupId='" + groupId + '\'' +
            "}";
    }
}

