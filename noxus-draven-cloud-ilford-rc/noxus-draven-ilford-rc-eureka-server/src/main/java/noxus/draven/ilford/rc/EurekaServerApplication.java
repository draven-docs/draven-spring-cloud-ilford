package noxus.draven.ilford.rc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 〈功能概述〉<br>
 *
 * @className: EurekaServerApplication
 * @package: noxus.draven.ilford.rc
 * @author: draven
 * @date: 2020/12/17 11:58
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
