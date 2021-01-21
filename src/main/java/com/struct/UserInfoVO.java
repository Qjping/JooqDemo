package com.struct;

/**
 * table name: user_info
 * author name: abel
 * create time: 2021-01-21 14:54:01
 */
public class UserInfoVO {

    private String id;
    private String userAccountId;
    private String password;
    private String openid;
    private String tag;
    private String telphone;
    private String type;

    public void setId(String id){
        this.id=id;
    }

    public String getId(){
        return id;
    }

    public void setUserAccountId(String userAccountId){
        this.userAccountId=userAccountId;
    }

    public String getUserAccountId(){
        return userAccountId;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return password;
    }

    public void setOpenid(String openid){
        this.openid=openid;
    }

    public String getOpenid(){
        return openid;
    }

    public void setTag(String tag){
        this.tag=tag;
    }

    public String getTag(){
        return tag;
    }

    public void setTelphone(String telphone){
        this.telphone=telphone;
    }

    public String getTelphone(){
        return telphone;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "UserInfoVO{" +
            "id='" + id + '\'' +
            ", userAccountId='" + userAccountId + '\'' +
            ", password='" + password + '\'' +
            ", openid='" + openid + '\'' +
            ", tag='" + tag + '\'' +
            ", telphone='" + telphone + '\'' +
            ", type='" + type + '\'' +
            "}";
    }
}

