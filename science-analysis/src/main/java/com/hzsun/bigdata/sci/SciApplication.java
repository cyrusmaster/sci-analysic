package com.hzsun.bigdata.sci;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luomeng
 * @Classname: SciApplication
 * @Description: 主程序
 * @Date: 2020/8/17 10:25
 */
@MapperScan("com.hzsun.bigdata.sci.dao")
@SpringBootApplication
public class SciApplication {

    public static void main(String[] args) {
        SpringApplication.run(SciApplication.class, args);
    }

}
