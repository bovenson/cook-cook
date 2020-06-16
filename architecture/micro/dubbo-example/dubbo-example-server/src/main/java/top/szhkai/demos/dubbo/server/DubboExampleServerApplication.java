package top.szhkai.demos.dubbo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.szhkai.demos.dubbo.server.util.DubboRegistryHelper;

@SpringBootApplication
public class DubboExampleServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboExampleServerApplication.class, args);
		DubboRegistryHelper.registry();
	}
}
