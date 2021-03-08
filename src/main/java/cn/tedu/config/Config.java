package cn.tedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//扫描当前包和其子包
@ComponentScan("cn.tedu")
public class Config {
}
