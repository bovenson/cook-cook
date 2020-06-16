package top.szhkai.demos.dubbo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.szhkai.demos.dubbo.client.util.DubboRegistryHelper;

@SpringBootApplication
public class DubboExampleClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboExampleClientApplication.class, args);
		DubboRegistryHelper.find();
	}
}
