package com.icetai.portal.master;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.icetai.portal.master.mapper")
public class IcePortalMasterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcePortalMasterServiceApplication.class, args);
    }

}
