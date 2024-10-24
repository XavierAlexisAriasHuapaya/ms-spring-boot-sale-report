package dev.arias.huapaya.ms_sale_report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsSaleReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSaleReportApplication.class, args);
	}

}
