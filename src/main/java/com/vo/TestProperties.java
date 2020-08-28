package com.vo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;




@Component
@PropertySource("classpath:applicationText.properties")
@ConfigurationProperties(prefix = "user")
public class TestProperties {
    public String name;
    public Integer age;
    public String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   /* public static void main(String[] args) {
        @Autowired
        TestProperties testProperties;
        System.out.println(testProperties.getName());
    }*/
}
