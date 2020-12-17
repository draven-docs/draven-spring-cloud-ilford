package noxus.draven.ilford.rc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 〈功能概述〉<br>
 *
 * @className: ProviderApplication
 * @package: noxus.draven.ilford.rc
 * @author: draven
 * @date: 2020/12/17 14:41
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}

