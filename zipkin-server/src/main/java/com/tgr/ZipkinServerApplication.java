package com.tgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

import zipkin.server.EnableZipkinServer;

@SuppressWarnings("all")
@SpringBootApplication
@EnableEurekaClient
//@EnableZipkinServer//链路追踪	使用http传输链路数据
@EnableZipkinStreamServer//使用rabbitMQ传输链路数据
public class ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}
}
