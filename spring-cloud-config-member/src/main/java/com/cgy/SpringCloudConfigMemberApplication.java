package com.cgy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConfigMemberApplication  implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigMemberApplication.class, args);
	}

	@Value("${name}")
	private String name;
	
	@Value("${love}")
	private String love;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("name:"+name+"  love:"+love);
	}

}
