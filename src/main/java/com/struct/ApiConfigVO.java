package com.struct;

/**
 * table name: api_config
 * author name: abel
 * create time: 2021-01-21 14:54:01
 */
public class ApiConfigVO {

    private Integer id;
    private String url;
    private String headers;

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

    public void setHeaders(String headers){
        this.headers=headers;
    }

    public String getHeaders(){
        return headers;
    }

    @Override
    public String toString() {
        return "ApiConfigVO{" +
            "id=" + id +
            ", url='" + url + '\'' +
            ", headers='" + headers + '\'' +
            "}";
    }
}

