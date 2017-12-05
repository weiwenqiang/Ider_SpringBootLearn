package com.wwq.two3;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by wwq on 2017/12/4.
 */
public class UserFastjson {
    private String name;

    @JSONField(format = "yyyy-MM-dd hh:mm")
    private Date createTime;

    /**
     * 不想返回remarks
     * serialize:是否需要序列化
     */
    @JSONField(serialize = false)
    private String remarks;

    private int age;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
