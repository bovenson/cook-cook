package top.szhkai.demos.dubbo.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.szhkai.demos.dubbo.client.util.DubboRegistryHelper;
import top.szhkai.demos.dubbo.services.DubboExampleService;

@RestController
public class DubboExampleServiceController {

    @RequestMapping("echo")
    public String echo(@RequestParam String word) {
        DubboExampleService service = DubboRegistryHelper.find();
        return service.echo(word);
    }
}
