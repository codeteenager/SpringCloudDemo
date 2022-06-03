package cn.com.codeteenager.cloudproviderorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudProviderOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderOrderApplication.class, args);
    }

}
