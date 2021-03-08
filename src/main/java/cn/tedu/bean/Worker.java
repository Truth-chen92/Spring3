package cn.tedu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;

@Component
public class Worker implements Serializable {
    private String name="光头强";
    //spring 提供的自动注入功能 先根据类型匹配 再根据名字匹配
//    @Autowired
//    @Resource
    private Saw saw;

    public Worker() {
    }
    //标注在构造器上 spring会自动调用构造器注入属性
    @Autowired
    public Worker(Saw saw) {
        System.out.println("spring调用了构造器");
        this.saw = saw;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Saw getSaw() {
        return saw;
    }
    //标注在方法上 spring就会自动调用方法 注入属性值
//@Autowired
//    @Resource
    public void setSaw(Saw saw) {
    System.out.println("spring调用了set方法");
        this.saw = saw;
    }

    public void work(){
        System.out.println(name+"使用"+saw+"砍树...");
    }
}
