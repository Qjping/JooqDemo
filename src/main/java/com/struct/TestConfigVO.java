package com.struct;

import java.time.LocalDateTime;

/**
 * table name: test_config
 * author name: abel
 * create time: 2021-01-21 14:54:01
 */
public class TestConfigVO {

    private String id;
    private String baseHeader;
    private String baseUrl;
    private LocalDateTime createTime;
    private String groupId;
    private LocalDateTime updateTime;
    private String userDefineParam;

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    public void setBaseHeader(String baseHeader){
        this.baseHeader=baseHeader;
    }

    public String getBaseHeader(){
        return baseHeader;
    }

    public void setBaseUrl(String baseUrl){
        this.baseUrl=baseUrl;
    }

    public String getBaseUrl(){
        return baseUrl;
    }

    public void setCreateTime(LocalDateTime createTime){
        this.createTime=createTime;
    }

    public LocalDateTime getCreateTime(){
        return createTime;
    }

    public void setGroupId(String groupId){
        this.groupId=groupId;
    }

    public String getGroupId(){
        return groupId;
    }

    public void setUpdateTime(LocalDateTime updateTime){
        this.updateTime=updateTime;
    }

    public LocalDateTime getUpdateTime(){
        return updateTime;
    }

    public void setUserDefineParam(String userDefineParam){
        this.userDefineParam=userDefineParam;
    }

    public String getUserDefineParam(){
        return userDefineParam;
    }

    @Override
    public String toString() {
        return "TestConfigVO{" +
            "id='" + id + '\'' +
            ", baseHeader='" + baseHeader + '\'' +
            ", baseUrl='" + baseUrl + '\'' +
            ", createTime=" + createTime +
            ", groupId='" + groupId + '\'' +
            ", updateTime=" + updateTime +
            ", userDefineParam='" + userDefineParam + '\'' +
            "}";
    }
}

