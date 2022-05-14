package org.line.core.test.po;

import org.hibernate.validator.constraints.Length;

/**
 * @Author: yangcs
 * @Date: 2022/5/14 13:36
 * @Description:
 */
public class ValidPo {

    @Length(max = 3 )
    private  String  name;
    private  String  key;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "ValidPo{" +
                "name='" + name + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
