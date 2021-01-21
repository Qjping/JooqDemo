package com.struct;

import java.time.LocalDateTime;

/**
 * table name: user_define_param
 * author name: abel
 * create time: 2021-01-21 14:54:01
 */
public class UserDefineParamVO {

    private Integer id;
    private Integer caseGroupId;
    private String userDefineParameters;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String createAt;
    private LocalDateTime updateAt;

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getId(){
        return id;
    }

    public void setCaseGroupId(Integer caseGroupId){
        this.caseGroupId=caseGroupId;
    }

    public Integer getCaseGroupId(){
        return caseGroupId;
    }

    public void setUserDefineParameters(String userDefineParameters){
        this.userDefineParameters=userDefineParameters;
    }

    public String getUserDefineParameters(){
        return userDefineParameters;
    }

    public void setCreateTime(LocalDateTime createTime){
        this.createTime=createTime;
    }

    public LocalDateTime getCreateTime(){
        return createTime;
    }

    public void setUpdateTime(LocalDateTime updateTime){
        this.updateTime=updateTime;
    }

    public LocalDateTime getUpdateTime(){
        return updateTime;
    }

    public void setCreateAt(String createAt){
        this.createAt=createAt;
    }

    public String getCreateAt(){
        return createAt;
    }

    public void setUpdateAt(LocalDateTime updateAt){
        this.updateAt=updateAt;
    }

    public LocalDateTime getUpdateAt(){
        return updateAt;
    }

    @Override
    public String toString() {
        return "UserDefineParamVO{" +
            "id=" + id +
            ", caseGroupId=" + caseGroupId +
            ", userDefineParameters=" + userDefineParameters +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", createAt='" + createAt + '\'' +
            ", updateAt=" + updateAt +
            "}";
    }
}

