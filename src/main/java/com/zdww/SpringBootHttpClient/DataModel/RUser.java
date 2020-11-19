package com.zdww.SpringBootHttpClient.DataModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "")
public class RUser {

    //定义私有属性
    private String id = null;
    private String email = null;
    private List<String> groups = null;
    private List<String> roles = null;

//    //无参数的构造器
//    public RUser() {}
//    //有参数的构造器
//    public RUser(String id , String email , List<String> groups , List<String> roles) {
//        this.id = id;
//        this.email = email;
//        this.groups = groups;
//        this.roles = roles;
//    }
    //创建的setter和getter方法

    @ApiModelProperty(value = "")
    @JsonProperty("id")
    public String getId() { return id; }
    public void setId (String id) { this.id = id; }

    @ApiModelProperty(value = "")
    @JsonProperty("email")
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @ApiModelProperty(value = "")
    @JsonProperty("groups")
    public List<String> getGroups() { return groups; }
    public void setGroups(List<String> groups) { this.groups = groups; }

    @ApiModelProperty(value = "")
    @JsonProperty("roles")
    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }
}
