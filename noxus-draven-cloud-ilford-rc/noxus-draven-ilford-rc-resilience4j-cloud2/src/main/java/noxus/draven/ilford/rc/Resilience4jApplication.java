package noxus.draven.ilford.rc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Resilience4jApplication {
    public static void main(String[] args) {
        SpringApplication.run(Resilience4jApplication.class, args);
    }


    @Value("${name}")
    private String demo;
}
